package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.DashBoard;
import pages.LogIn;
import utilities.Driver;
import utilities.ReusableMethods;

public class LoginStepDefs {

    LogIn logIn = new LogIn();
    DashBoard dashBoard = new DashBoard();

    @Given("user goes to login page")
    public void user_goes_to_login_page(){
        Driver.getDriver().get("https://e2e-assessment.piton.com.tr");
    }

    @Then("user assert that Login Form contains username, password and login button")
    public void userAssertThatLoginFormContainsUsernamePasswordAndLoginButton() throws InterruptedException {
        boolean username = logIn.usernameBox.isDisplayed();
        boolean password = logIn.passwordBox.isDisplayed();
        String login = logIn.loginButton.getText();

        Assert.assertTrue(username);
        Assert.assertTrue(password);
        Assert.assertEquals("Login",login);
    }

    @Given("user clicks login button")
    public void userClicksLoginButton() {
        logIn.loginButton.click();
        ReusableMethods.waitFor(1);
    }

    @Then("user assert that validation errors")
    public void userAssertThatValidationErrors() {
        String usernameErrorMessage = logIn.usernameErrorMessage.getText();
        String passwordErrorMessage = logIn.passwordErrorMessage.getText();
        Assert.assertEquals("Username field is required",usernameErrorMessage);
        Assert.assertEquals("Password field is required",passwordErrorMessage);
    }

    @Given("user enters valid username and password")
    public void userEntersValidUsernameAndPassword() throws InterruptedException {

        logIn.usernameBox.sendKeys("automationtest");

        logIn.passwordBox.sendKeys("123456789");
    }

    @Then("user verifies welcome message")
    public void userVerifiesWelcomeMessage() throws InterruptedException {
        String welcomeMessage = dashBoard.welcomeMessage.getText();
        Assert.assertEquals("Welcome Automation Test User",welcomeMessage);
    }

    @And("user closes the browser")
    public void userClosesTheBrowser() {
        Driver.closeDriver();
    }
}

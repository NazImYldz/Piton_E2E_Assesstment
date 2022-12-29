package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.DashBoard;
import pages.Event;
import pages.LogIn;
import utilities.Driver;
import utilities.ReusableMethods;

public class DashBoardStepDefs {

    DashBoard dashBoard = new DashBoard();
    LogIn logIn = new LogIn();
    Event event = new Event();

    @Then("user verifies that dashboard page has been loaded successfully")
    public void user_verifies_that_dashboard_page_has_been_loaded_successfully() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard"));
    }


    @And("user enters invalid username and password")
    public void userEntersInvalidUsernameAndPassword() {
        logIn.usernameBox.sendKeys("AutomationTester");
        logIn.passwordBox.sendKeys("9876544321");
        ReusableMethods.waitFor(1);
        logIn.loginButton.click();
    }

    @Then("user verifies that redirected to login page")
    public void userVerifiesThatRedirectedToLoginPage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));
    }

    @Then("user verifies that list of events is visible or notification message is visible")
    public void userVerifiesThatListOfEventsIsVisibleOrNotificationMessageIsVisible() {
        if (dashBoard.listOfEvents.isEmpty()){
        Assert.assertTrue(dashBoard.noRegisteredMsg.getText().contains("No registered event"));
        }else {
            Assert.assertFalse(dashBoard.listOfEvents.isEmpty());
        }
    }

    @Then("user verifies that navigated to edit event")
    public void userVerifiesThatNavigatedToEditEvent() {
        Assert.assertTrue(event.editEventHeader.getText().contains("Edit Event"));
    }

    @Given("user clicks delete button")
    public void userClicksDeleteButton() {
        dashBoard.deleteBtn.click();
    }

    @Then("user verifies that notification message is visible")
    public void userVerifiesThatNotificationMessageIsVisible() {
        Assert.assertTrue(dashBoard.noRegisteredMsg.getText().contains("No registered event"));
    }

    @Given("user clicks participant button")
    public void userClicksParticipantButton() {
        dashBoard.participantButton.click();
    }

    @Then("user verifies that participants of event table is visible")
    public void userVerifiesThatParticipantsOfEventTableIsVisible() {
        Assert.assertTrue(dashBoard.participantOfEvent.getText().contains("Participiants Of Event Module"));
    }
}

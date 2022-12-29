package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LogIn {


    public LogIn() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "username")
    public WebElement usernameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button")
    public WebElement loginButton;

    @FindBy(xpath = "//mat-error[@id='mat-error-0']")
    public WebElement usernameErrorMessage;

    @FindBy(xpath = "//mat-error[@id='mat-error-1']")
    public WebElement passwordErrorMessage;

}

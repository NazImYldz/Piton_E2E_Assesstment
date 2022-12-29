package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Event {

    public Event () {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div/h1")
    public WebElement createEventHeader;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameBox;

    @FindBy(xpath = "//input[@id='description']")
    public WebElement descriptionBox;

    @FindBy(xpath = "//input[@formcontrolname='date']")
    public WebElement dateBox;

    @FindBy(xpath = "//mat-datepicker-toggle")
    public WebElement openCalender;

    @FindBy(xpath = "//tbody/tr[5]/td[5]")
    public WebElement calenderDay;

    @FindBy(xpath = "(//div/button)[2]")
    public WebElement createNewEventButton;

    @FindBy(xpath = "//mat-error[text()='Event name field is required']")
    public WebElement eventNameErrorMsg;

    @FindBy(xpath = "//mat-error[text()='Please choose a valid date']")
    public WebElement dateErrorMessage;

    @FindBy(xpath = "//mat-error[text()='Participant name is required']")
    public WebElement firstNameErrorMsg;

    @FindBy(xpath = "//mat-error[text()='Participant last name is required']")
    public WebElement lastNameErrorMsg;

    @FindBy(xpath = "//mat-error[text()='Please enter email or phone number']")
    public WebElement contactErrorMsg;

    @FindBy(xpath = "(//div/button/span)[1]")
    public WebElement addParticipantButton;

    @FindBy(xpath = "//tbody/tr/td[5]")
    public List<WebElement> deleteButtons;

    @FindBy(xpath = "//p")
    public WebElement addParticipantMsg;

    @FindBy(xpath = "//tbody/tr/td[2]//input")
    public WebElement firstNameBox;

    @FindBy(xpath = "//tbody/tr/td[3]//input")
    public WebElement lastNameBox;

    @FindBy(xpath = "//tbody/tr/td[4]//input")
    public WebElement contactBox;

    @FindBy(xpath = "//h1")
    public WebElement editEventHeader;

}

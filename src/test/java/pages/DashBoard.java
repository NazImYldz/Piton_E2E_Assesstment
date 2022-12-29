package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DashBoard {

    public DashBoard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "welcomeUserMessage")
    public WebElement welcomeMessage;

    @FindBy(css = "span.mat-button-wrapper")
    public WebElement createEventButton;

    @FindBy(xpath = "//span[text()='Event created successfully']")
    public WebElement createdSuccessfullyMsg;

    @FindBy(xpath = "//tbody/tr/td[5]/button[1]")
    public WebElement editButton;

    @FindBy(xpath = "//tbody/tr/td[5]/button[2]")
    public WebElement deleteBtn;

    @FindBy(xpath = "//tbody/tr/td[5]/button[3]")
    public WebElement participantButton;

    @FindBy(xpath = "//h2")
    public WebElement participantOfEvent;

    @FindBy(xpath = "//span[text()='Event updated successfully']")
    public WebElement updatedSuccessfullyMsg;

    @FindBy(xpath = "//mat-card-content")
    public WebElement noRegisteredMsg;

    @FindBy(xpath = "//tbody/tr")
    public List<WebElement> listOfEvents;


}

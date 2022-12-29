package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DashBoard;
import pages.Event;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

public class EventStepDefs {

        DashBoard dashBoard = new DashBoard();
        Event event = new Event();

    @Given("user clicks create event button")
    public void userClicksCreateEventButton() {
        dashBoard.createEventButton.click();
    }

    @Then("user verifies that create event form is visible")
    public void userVerifiesThatCreateEventFormIsVisible() {
        String eventFormHeader = event.createEventHeader.getText();
        Assert.assertEquals("Create Event",eventFormHeader);
        Assert.assertTrue(event.nameBox.isDisplayed());
        Assert.assertTrue(event.descriptionBox.isDisplayed());
        Assert.assertTrue(event.dateBox.isDisplayed());
    }

    @Given("user clicks Create New Event button")
    public void userClicksCreateNewEventButton() {
        event.createNewEventButton.click();
    }

    @Then("user assert that validation errors are visible")
    public void userAssertThatValidationErrorsAreVisible() {
        ReusableMethods.waitFor(1);
        Assert.assertEquals("Event name field is required",event.eventNameErrorMsg.getText());
        Assert.assertEquals("Please choose a valid date",event.dateErrorMessage.getText());
        Assert.assertEquals("Participant name is required",event.firstNameErrorMsg.getText());
        Assert.assertEquals("Participant last name is required",event.lastNameErrorMsg.getText());
        Assert.assertEquals("Please enter email or phone number",event.contactErrorMsg.getText());
    }

    @Given("user clicks Add Participant button")
    public void userClicksAddParticipantButton() {
        event.addParticipantButton.click();
    }

    @Then("user verifies that new participant was added")
    public void userVerifiesThatNewParticipantWasAdded() {
        List<WebElement> participants = Driver.getDriver().findElements(By.xpath("//tbody/tr/td[1]"));
        Assert.assertTrue(participants.size()>1);
    }


    @Given("user clicks delete button of all participants")
    public void userClicksDeleteButtonOfAllParticipants() {
        int sizeOfList = event.deleteButtons.size();
        for (int i=0; i< sizeOfList; i++) {
            event.deleteButtons.get(0).click();
        }
    }

    @Then("user verifies that an error message has occurred")
    public void userVerifiesThatAnErrorMessageHasOccurred() {
        Assert.assertEquals("Please add participant!",event.addParticipantMsg.getText());
    }

    @Given("user fills all required fields and clicks Create New Event button")
    public void userFillsAllRequiredFieldsAndClicksCreateNewEventButton() {
        event.nameBox.sendKeys("Event Module Test Case 5");
        event.openCalender.click();
        ReusableMethods.waitFor(1);
        event.calenderDay.click();
        event.firstNameBox.sendKeys("Nazım");
        event.lastNameBox.sendKeys("Yıldız");
        event.contactBox.sendKeys("12345678");
        event.createNewEventButton.click();
    }

    @Then("user verifies that redirected to dashboard page")
    public void userVerifiesThatRedirectedToDashboardPage() {
        Assert.assertEquals("https://e2e-assessment.piton.com.tr/dashboard",Driver.getDriver().getCurrentUrl());
    }

    @And("user verifies that create successful message is visible")
    public void userVerifiesThatCreateSuccessfulMessageIsVisible() {
        String successfulMessage = dashBoard.createdSuccessfullyMsg.getText();
        Assert.assertEquals("Event created successfully",successfulMessage);
    }

    @And("user clicks edit button")
    public void userClicksEditButton() {
        dashBoard.editButton.click();
    }

    @Then("user verifies that all fields are correctly populated compared to the previous one")
    public void userVerifiesThatAllFieldsAreCorrectlyPopulatedComparedToThePreviousOne() {
        String eventName = ReusableMethods.getValueByJS("name");
        Assert.assertEquals("Event Module Test Case 5",eventName);
    }

    @Then("user updates event name and click Update Event button")
    public void userUpdatesEventNameAndClickUpdateEventButton() {
        event.nameBox.clear();
        event.nameBox.sendKeys("Event Module Test Case 5 Updated");
        event.createNewEventButton.click();
    }

    @And("user verifies that update successful message is visible")
    public void userVerifiesThatUpdateSuccessfulMessageIsVisible() {
        ReusableMethods.waitFor(1);
        String successfulMessage = dashBoard.updatedSuccessfullyMsg.getText();
        Assert.assertEquals("Event updated successfully",successfulMessage);
    }
}

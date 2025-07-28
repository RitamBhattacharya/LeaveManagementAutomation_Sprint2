package definition;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.AskLibrarianPage;
import utilities.DriverFactory;

public class AskLibrarianSteps {
    WebDriver driver = DriverFactory.getDriver();
    AskLibrarianPage page = new AskLibrarianPage(driver);

    @Given("I navigate to the Ask a Librarian page")
    public void navigateToPage() {
        page.navigateToPage("http://webapps.tekstac.com/SeleniumApp2/Library/Services.html");
    }

    @When("I select the {string} option")
    public void selectOption(String option) {
        page.selectOption(option);
    }

    @And("I enter a valid email and query")
    public void enterValidEmailQuery() {
        page.enterEmail("user@example.com");
        page.enterEmailQuery("What are your library hours?");
    }

    @And("I enter a malformed email")
    public void enterMalformedEmail() {
        page.enterEmail("invalid-email");
        page.enterEmailQuery("What books are available?");
    }

    @And("I leave the query field blank")
    public void leaveEmailQueryBlank() {
        page.enterEmail("user@example.com");
        page.enterEmailQuery("");
    }

    @And("I submit the form")
    public void submitForm() {
        page.submitEmailForm();
    }

    @Then("I should see a success message")
    public void verifySuccessMessage() {
        Assert.assertTrue(page.getSuccessMessage().contains("Thank you"));
    }

    @Then("I should see an error message {string}")
    public void verifyErrorMessage(String message) {
        Assert.assertTrue(
            page.getEmailError().contains(message) ||
            page.getQueryError().contains(message) ||
            page.getPhoneError().contains(message) ||
            page.getNameError().contains(message) ||
            page.getChatQueryError().contains(message)
        );
    }

    @And("I enter valid Name, Phone, and Query")
    public void enterValidChatInfo() {
        page.enterName("John Doe");
        page.enterPhone("9876543210");
        page.enterChatQuery("Do you have study rooms?");
    }

    @And("I enter a short phone number")
    public void enterShortPhoneNumber() {
        page.enterName("John Doe");
        page.enterPhone("12345");
        page.enterChatQuery("Test");
    }

    @And("I enter alphabetic characters in the phone field")
    public void enterAlphabeticPhone() {
        page.enterName("Jane");
        page.enterPhone("abcdphone");
        page.enterChatQuery("Any events?");
    }

    @And("I leave the name field blank")
    public void leaveNameBlank() {
        page.enterName("");
        page.enterPhone("9876543210");
        page.enterChatQuery("Question here");
    }

    @And("I leave the query field blank")
    public void leaveChatQueryBlank() {
        page.enterName("User");
        page.enterPhone("9876543210");
        page.enterChatQuery("");
    }

    @Then("the Library field should be pre-filled")
    public void verifyLibraryFieldPrefilled() {
        Assert.assertFalse(page.getLibraryFieldValue().isEmpty());
    }

    @Then("I should see the librarian contact number and hours")
    public void verifyCallInfoDisplayed() {
        Assert.assertFalse(page.getContactNumber().isEmpty());
        Assert.assertFalse(page.getContactHours().isEmpty());
    }
}



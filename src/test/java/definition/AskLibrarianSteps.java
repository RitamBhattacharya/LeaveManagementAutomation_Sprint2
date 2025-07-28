package definition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.en.*;
import pages.AskLibrarianPage;
import utils.DriverFactory;

public class AskLibrarianSteps {
    WebDriver driver = DriverFactory.getDriver();
    AskLibrarianPage librarianPage = new AskLibrarianPage(driver);

    @Given("I navigate to the Ask a Librarian page")
    public void i_navigate_to_ask_librarian_page() {
        librarianPage.open();
    }

    @When("I select the {string} option")
    public void i_select_option(String option) {
        librarianPage.selectOption(option);
    }

    @When("I enter a valid email and query")
    public void enter_valid_email_query() {
        librarianPage.fillEmailForm("user@example.com", "How to access e-books?");
    }

    @When("I enter a malformed email")
    public void enter_invalid_email() {
        librarianPage.fillEmailForm("invalid-email", "Query content");
    }

    @When("I leave the query field blank")
    public void leave_query_blank() {
        librarianPage.fillEmailForm("user@example.com", "");
    }

    @When("I enter valid Name, Phone, and Query")
    public void enter_valid_chat_input() {
        librarianPage.fillChatForm("Anamika", "9876543210", "How to contact librarian?");
    }

    @When("I enter a short phone number")
    public void enter_short_phone() {
        librarianPage.fillChatForm("Anamika", "123", "Query text");
    }

    @When("I enter alphabetic characters in the phone field")
    public void enter_alpha_phone() {
        librarianPage.fillChatForm("Anamika", "abcde", "Query text");
    }

    @When("I leave the name field blank")
    public void leave_name_blank() {
        librarianPage.fillChatForm("", "9876543210", "Query text");
    }

    @When("I leave the query field blank")
    public void leave_chat_query_blank() {
        librarianPage.fillChatForm("Anamika", "9876543210", "");
    }

    @When("I submit the form")
    public void submit_form() {
        librarianPage.submitForm();
    }

    @Then("I should see a success message")
    public void verify_success() {
        Assert.assertTrue(librarianPage.getSuccessMessage().contains("Success"));
    }

    @Then("I should see an error message {string}")
    public void verify_error(String expected) {
        Assert.assertEquals(librarianPage.getErrorMessage(), expected);
    }

    @Then("I should see the librarian contact number and hours")
    public void verify_contact_info() {
        Assert.assertTrue(librarianPage.getContactInfo().contains("Contact"));
    }

    @Then("the Library field should be pre-filled")
    public void verify_prefilled_library_field() {
        Assert.assertTrue(librarianPage.isLibraryPrefilled());
    }
}

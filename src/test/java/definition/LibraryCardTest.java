package definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pagebean.LibraryCardActions;
import io.cucumber.java.en.*;

public class LibraryCardTest {

    WebDriver driver;
    LibraryCardActions form;

    @Given("the user is on the form page")
    public void the_user_is_on_the_form_page() {
        driver = new ChromeDriver();
        driver.get("http://webapps.tekstac.com/SeleniumApp2/Library/Library.html"); 
        form = new LibraryCardActions(driver);
    }

    @When("the user enters {string} as the first name")
    public void enter_first_name(String fname) {
        form.enterFirstName(fname);
    }

    @When("leaves the first name blank")
    public void leave_first_name_blank() {
        form.enterFirstName("");
    }

    @When("the user enters {string} as the last name")
    public void enter_last_name(String lname) {
        form.enterLastName(lname);
    }

    @When("leaves the last name blank")
    public void leave_last_name_blank() {
        form.enterLastName("");
    }

    @When("enters a valid age {string}")
    public void enter_valid_age(String age) {
        form.enterAge(age);
    }

    @When("enters an invalid age {string}")
    public void enter_invalid_age(String age) {
        form.enterAge(age);
    }

    @When("enters a valid email {string}")
    public void enter_valid_email(String email) {
        form.enterEmail(email);
    }

    @When("enters an invalid email {string}")
    public void enter_invalid_email(String email) {
        form.enterEmail(email);
    }

    @When("enters a valid phone number {string}")
    public void enter_valid_phone(String phone) {
        form.enterPhone(phone);
    }

    @When("enters an invalid phone number {string}")
    public void enter_invalid_phone(String phone) {
        form.enterPhone(phone);
    }

    @When("the user selects {string} in the Work section")
    public void select_work_type(String workType) {
        if (workType.equalsIgnoreCase("Student")) {
            form.selectStudent();
        } else {
            form.selectEmployee();
        }
    }

    @When("enters {string} as the school name")
    public void enter_school_name(String schoolName) {
        form.enterSchoolName(schoolName);
    }

    @When("enters {string} as the company name")
    public void enter_company_name(String companyName) {
        form.enterCompanyName(companyName);
    }

    @When("leaves the school name field blank")
    public void leave_school_name_blank() {
        form.enterSchoolName("");
    }

    @When("leaves the company name field blank")
    public void leave_company_name_blank() {
        form.enterCompanyName("");
    }

    @When("selects {string} from the Action dropdown")
    public void select_action_dropdown(String action) {
        form.selectCardAction(action);
    }

    @When("does not select any option from the Action dropdown")
    public void do_not_select_dropdown() {
        // Do nothing or keep default
    }

    @Then("the form should display a validation error for the last name")
    public void error_for_last_name() {
        // Add assertion or log
    }

    @Then("the form should display a validation error for the first name")
    public void error_for_first_name() {
        // Add assertion or log
    }

    @Then("the form should display a validation error for the email field")
    public void error_for_email() {
        // Add assertion or log
    }

    @Then("the form should display a validation error for the phone number field")
    public void error_for_phone() {
        // Add assertion or log
    }

    @Then("the form should display a validation error for the age field")
    public void error_for_age() {
        // Add assertion or log
    }

    @Then("the form should accept the input and proceed")
    public void accept_input_and_proceed() {
        form.clickSubmit();
        // Add confirmation
    }

    @Then("the form should display a validation error for the school name")
    public void error_for_school_name() {
        // Add assertion or log
    }

    @Then("the form should display a validation error for the company name")
    public void error_for_company_name() {
        // Add assertion or log
    }

    @Then("the form should display a validation error for the Action field")
    public void error_for_action_dropdown() {
        // Add assertion or log
    }

    @Then("the form should be submitted successfully")
    public void form_submitted_successfully() {
        form.clickSubmit();
        // Add confirmation
    }
}

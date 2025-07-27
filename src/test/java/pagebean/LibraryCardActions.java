package pagebean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryCardActions {
    WebDriver driver;

    public LibraryCardActions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Form fields
    @FindBy(id = "firstName")
    WebElement firstNameField;

    @FindBy(id = "lastName")
    WebElement lastNameField;

    @FindBy(id = "age")
    WebElement ageField;

    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "phone")
    WebElement phoneField;

    @FindBy(id = "student")
    WebElement studentRadio;

    @FindBy(id = "employee")
    WebElement employeeRadio;

    @FindBy(id = "schoolName")
    WebElement schoolNameField;

    @FindBy(id = "companyName")
    WebElement companyNameField;

    @FindBy(id = "action")
    WebElement cardActionDropdown;

    @FindBy(id = "submit")
    WebElement submitButton;

    // Actions
    public void enterFirstName(String fname) {
        firstNameField.clear();
        firstNameField.sendKeys(fname);
    }

    public void enterLastName(String lname) {
        lastNameField.clear();
        lastNameField.sendKeys(lname);
    }

    public void enterAge(String age) {
        ageField.clear();
        ageField.sendKeys(age);
    }

    public void enterEmail(String email) {
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void enterPhone(String phone) {
        phoneField.clear();
        phoneField.sendKeys(phone);
    }

    public void selectStudent() {
        studentRadio.click();
    }

    public void selectEmployee() {
        employeeRadio.click();
    }

    public void enterSchoolName(String schoolName) {
        schoolNameField.clear();
        schoolNameField.sendKeys(schoolName);
    }

    public void enterCompanyName(String companyName) {
        companyNameField.clear();
        companyNameField.sendKeys(companyName);
    }

    public void selectCardAction(String actionText) {
        org.openqa.selenium.support.ui.Select dropdown = new org.openqa.selenium.support.ui.Select(cardActionDropdown);
        dropdown.selectByVisibleText(actionText);
    }

    public void clickSubmit() {
        submitButton.click();
    }
}

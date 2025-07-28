package pagebean;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AskLibrarianPage {
    WebDriver driver;

    public AskLibrarianPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "emailOption") WebElement emailOption;
    @FindBy(id = "callOption") WebElement callOption;
    @FindBy(id = "chatOption") WebElement chatOption;


    @FindBy(id = "emailInput") WebElement emailInput;
    @FindBy(id = "queryInput") WebElement queryInput;
    @FindBy(id = "submitBtn") WebElement submitBtn;
    @FindBy(id = "emailError") WebElement emailError;
    @FindBy(id = "queryError") WebElement queryError;
    @FindBy(id = "successMsg") WebElement successMsg;
  

    @FindBy(id = "contactNumber") WebElement contactNumber;
    @FindBy(id = "contactHours") WebElement contactHours;


    @FindBy(id = "nameInput") WebElement nameInput;
    @FindBy(id = "phoneInput") WebElement phoneInput;
    @FindBy(id = "chatQueryInput") WebElement chatQueryInput;
    @FindBy(id = "phoneError") WebElement phoneError;
    @FindBy(id = "nameError") WebElement nameError;
    @FindBy(id = "chatQueryError") WebElement chatQueryError;
    @FindBy(id = "libraryField") WebElement libraryField;

    public void navigateToPage(String url) {
        driver.get("http://webapps.tekstac.com/SeleniumApp2/Library/Services.html");
    }

    public void selectOption(String option) {
        switch (option.toLowerCase()) {
            case "email": emailOption.click(); break;
            case "call": callOption.click(); break;
            case "chat": chatOption.click(); break;
        }
    }

    public void enterEmail(String email) { 
      emailInput.clear(); 
      emailInput.sendKeys(email); 
    }
    public void enterEmailQuery(String query) { 
      queryInput.clear(); 
      queryInput.sendKeys(query); 
    }
    public void submitEmailForm() { 
      submitBtn.click(); 
    }
    public String getSuccessMessage() { 
      return successMsg.getText(); 
    }
    public String getEmailError() { 
      return emailError.getText(); 
    }
    public String getQueryError() { 
      return queryError.getText(); 
    }

    public String getContactNumber() {
      return contactNumber.getText(); 
    }
    public String getContactHours() { 
      return contactHours.getText(); 
    }


    public void enterName(String name) { 
      nameInput.clear(); 
      nameInput.sendKeys(name); 
    }
    public void enterPhone(String phone) { 
      phoneInput.clear(); 
      phoneInput.sendKeys(phone); 
    }
    public void enterChatQuery(String query) { 
      chatQueryInput.clear(); 
      chatQueryInput.sendKeys(query); 
    }
    public void submitChatForm() { 
      submitBtn.click(); 
    }
    public String getPhoneError() { 
      return phoneError.getText(); 
    }
    public String getNameError() { 
      return nameError.getText(); 
    }
    public String getChatQueryError() { 
      return chatQueryError.getText();
    }
    public String getLibraryFieldValue() { 
      return libraryField.getAttribute("value");
    }
}


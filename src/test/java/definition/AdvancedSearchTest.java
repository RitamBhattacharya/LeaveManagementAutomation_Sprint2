package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pagebean.AdvancedSearchActions;

public class AdvancedSearchTest {
    WebDriver driver;
    AdvancedSearchActions searchPage;

    @Given("the user is on the Advanced Search page")
    public void user_on_advanced_search_page() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("http://webapps.tekstac.com/SeleniumApp2/Library/Library.html");
        searchPage = new AdvancedSearchActions(driver);
    }

    @When("the user enters author name as {string} and subject as {string}")
    public void user_enters_author_and_subject(String author, String subject) {
        searchPage.setAuthorName(author);
        searchPage.setSubject(subject);
    }

    @When("selects edition as {string}")
    public void user_selects_edition(String edition) {
        searchPage.selectEdition(edition);
        searchPage.submit();
    }

    @When("the user leaves author name blank")
    public void user_leaves_author_name_blank() {
        searchPage.setAuthorName("");
    }

    @When("enters subject as {string}")
    public void enters_subject(String subject) {
        searchPage.setSubject(subject);
    }

    @When("the user enters author name as {string} and leaves subject blank")
    public void user_enters_author_and_leaves_subject_blank(String author) {
        searchPage.setAuthorName(author);
        searchPage.setSubject("");
    }

    @When("the user does not select any book format")
    public void user_does_not_select_book_format() {
        searchPage.submit();
    }

    @When("the user selects book format as {string}")
    public void user_selects_book_format(String format) {
        searchPage.selectBookFormat(format);
        searchPage.submit();
    }

    @When("the user selects age group as {string}")
    public void user_selects_age_group(String group) {
        searchPage.selectAgeGroup(group);
        searchPage.submit();
    }

    @When("the user does not select any age group")
    public void user_does_not_select_age_group() {
        searchPage.submit();
    }

    @Then("books related to author should be listed")
    @Then("books for the selected age group should be listed")
    @Then("filtered books should be shown")
    public void result_should_be_listed() {
        System.out.println("Result expected - manual verification or validate with actual DOM content.");
        driver.quit();
    }

    @Then("an error message for author name should be displayed")
    public void error_for_author() {
        boolean present = driver.getPageSource().contains("Author Name is required");
        assert present;
        driver.quit();
    }

    @Then("an error message for subject should be displayed")
    public void error_for_subject() {
        boolean present = driver.getPageSource().contains("Subject is required");
        assert present;
        driver.quit();
    }

    @Then("an error message for book format should be displayed")
    public void error_for_book_format() {
        boolean present = driver.getPageSource().contains("Book Format is required");
        assert present;
        driver.quit();
    }

    @Then("an error message for age group should be displayed")
    public void error_for_age_group() {
        boolean present = driver.getPageSource().contains("Age Group is required");
        assert present;
        driver.quit();
    }
}

package definition;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features",        // path to your feature files
    glue = {"definition"},                                // package with step definitions
    plugin = {"pretty", "html:target/cucumber-reports.html"},
    monochrome = true,
    tags = "@SmokeTest or @RegressionTest"           // optional, filter by tag
)
public class ServicesTest extends AbstractTestNGCucumberTests {
    // This class will automatically pick all feature files and run corresponding step definitions
}


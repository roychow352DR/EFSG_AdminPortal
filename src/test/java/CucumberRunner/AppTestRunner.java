package CucumberRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;


@CucumberOptions(features = "src/test/java/Features", glue = "StepDefinitions", monochrome = true
        , plugin = {"pretty",
        /*"html:target/cucumber-reports/cucumber-report.html",*/
        "json:target/cucumber-reports/cucumber-report.json","rerun:target/app_failed_scenarios.txt"},tags = "@App")
public class AppTestRunner extends AbstractTestNGCucumberTests {


    @Override
    public void runScenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) {
        super.runScenario(pickleWrapper, featureWrapper);

    }

/*    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }*/

}

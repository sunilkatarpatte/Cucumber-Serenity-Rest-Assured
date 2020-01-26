package stepdefinations;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty","rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue={"stepdefinations"},
        tags= {"@demo1"},
        monochrome=true,
        dryRun=false
)
public class AcceptanceTestSuite {}
//And:-tags = { "@SmokeTestCases, @SanityTestCases" })
//Or :-tags = { "@SmokeTestCases","@SanityTestCases" })
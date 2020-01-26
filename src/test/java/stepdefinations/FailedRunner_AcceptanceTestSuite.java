package stepdefinations;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(	features="@target/rerun.txt",
					glue= {"stepdefinations"},					
					plugin = {"pretty","rerun:target/rerun1.txt"},
					monochrome=true
				)

public class FailedRunner_AcceptanceTestSuite {

}

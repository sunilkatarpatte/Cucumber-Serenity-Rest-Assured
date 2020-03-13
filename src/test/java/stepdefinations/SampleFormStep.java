package stepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import pageObject.SampleForm;

public class SampleFormStep extends ScenarioSteps {

	SampleForm form;
	@Given("open sample form")
	public void open_sample_form() {
	    
	    form.open();
	
	}

	@When("enter all details on the form")
	public void enter_all_details_on_the_form() {
	    
	    form.enterAllDetails();
	}

	@When("click on submit")
	public void click_on_submit() {
	    
	    form.submitBtn();
	}

	@Then("verify all details submitted {string} scenario")
	public void verify_all_details_submitted(String status) {
	    
	    form.verifyAllDetails(status);
	}

}

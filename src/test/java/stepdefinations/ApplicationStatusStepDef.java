package stepdefinations;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import pageObject.ApplicationStatus;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ApplicationStatusStepDef {
	
	  ApplicationStatus theApplication=new ApplicationStatus();

	    @Given("I perform GET operation for {string}")
	    public void the_application_is_running(String expectedMessage) {
	        theApplication.getRequestForEmployee(expectedMessage);
	    }

	  
	    @Then("I should see all employee details with success code")
	    public void the_API_should_return() {
	      
	    	theApplication.verifyStatusCode();
	    	//  restAssuredThat(lastResponse -> lastResponse.body(equalTo(expectedMessage)));
	    }
	    
	    
	    @Given("I perform POST operation for {string}")
	    public void perform_POST_operation(String expectedMessage) {
	        theApplication.postRequestForEmployee(expectedMessage);
	    }
	    
	    @Then("I should see the created employee name")
	    public void postResponse() {
	    	theApplication.verifyPOSTStatusCode();
	    }
	    
}

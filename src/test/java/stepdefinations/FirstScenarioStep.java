package stepdefinations;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FirstScenarioStep {
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("I want to write a first step with preconditio");
	}

	@Given("some other precondition")
	public void some_other_precondition() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("First some other precondition");
	}

	@When("I complete action")
	public void i_complete_action() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("I want to complete first action");
	}

	@When("some other action")
	public void some_other_action() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("some other action first scenario");
	}

	@When("yet another action")
	public void yet_another_action() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("yet another action first step");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("I validate the outcomes first scenario");
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("Failed Test");
	 assertFalse(true);
	}

	@Given("I want to write a step with name{int}")
	public void i_want_to_write_a_step_with_name(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("Pass Test"+int1);
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("Pass Test"+int1);
	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("Pass Test");
	}

	@Then("I verify the Fail in step")
	public void i_verify_the_Fail_in_step() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("Pass Test");
	}
	
	@Given("I want to write a second step with precondition")
	public void i_want_to_write_a_second_step_with_precondition() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Second step with precondition");
	}

	@Given("some other precondition for second feature")
	public void some_other_precondition_for_second_feature() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println();
	}

	@When("I complete action all action")
	public void i_complete_action_all_action() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("yet another action required")
	public void yet_another_action_required() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("I validate the outcomes to check if execute")
	public void i_validate_the_outcomes_to_check_if_execute() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
}

package com.amdocs.bdd;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	ATM atm;
	String result;

	@Given("The cash to be delivered")
	public void the_cash_to_be_delivered() {
		atm = new ATM();
	    
	}

	@When("The input is {string}")
	public void the_input_is(String amount) {
		result = atm.check(Double.parseDouble(amount));
	   
	}

	@Then("The output is {string}")
	public void the_output_is(String expected) {
	   assertEquals(expected, result);
	}

}

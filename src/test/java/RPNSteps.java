package test.java;

import junit.framework.TestCase;
import main.java.RPNCalculator;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RPNSteps extends TestCase{
	String input;
	@Given("^User Enter \"([^\"]*)\"$")
	public void User_Enter(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		input = arg1;
	}

	@Then("^System Shows \"([^\"]*)\"$")
	public void System_Shows(String output) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		RPNCalculator rpnCalculator = new RPNCalculator();
		assertEquals(Double.parseDouble(output),	rpnCalculator.calculate(input));
	}

}

package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyPendingDef {
	
	@Given("the user is on the home page")
	public void the_user_is_on_the_home_page() {
	    System.out.println("the user is on the home page");
	}

	@When("the user clicks on the time option from the menu")
	public void the_user_clicks_on_the_time_option_from_the_menu() {
	    System.out.println("the user clicks on the time option from the menu");
	}

	@When("the user selects the name as {string}")
	public void the_user_selects_the_name_as(String string) {
	    System.out.println("the user selects the name as John Smith");
	}

	@When("clicks on the view button")
	public void clicks_on_the_view_button() {
	    System.out.println("clicks on the view button");
	}

	@Then("user should see the message as {string}")
	public void user_should_see_the_message_as(String string) {
	    System.out.println("user should see the message as test");
	}


}

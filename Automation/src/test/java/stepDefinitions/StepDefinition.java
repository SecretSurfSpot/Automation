package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinition {

    @Given("^User is on the internet banking landing page$")
    public void user_is_on_the_internet_banking_landing_page() throws Throwable {
        System.out.println("user_is_on_the_internet_banking_landing_page");
    }
    
    @When("^User logs on to app with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_logs_on_to_app_with_and_password(String arg1, String arg2) throws Throwable {
    	System.out.println("user_logs_on_to_app_with_username_and_password has username: " + arg1 + " and password: " + arg2);
    }

    @Then("^Homepage is populated$")
    public void homepage_is_populated() throws Throwable {
        System.out.println("homepage_is_populated");
    }
    
    @And("^Banking cards are displayed \"([^\"]*)\"$")
    public void banking_cards_are_displayed(String arg1) throws Throwable {
    	System.out.println("all_banking_cards_are_displayed is: " + arg1);
    }

}
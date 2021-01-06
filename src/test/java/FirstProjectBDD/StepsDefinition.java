package FirstProjectBDD;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsDefinition {
    private boolean CookieBelly;
    private boolean belly;

    @Given("^I have (\\d+) cookies in my belly$")
    public void i_have_cookies_in_my_belly(int cookies) {
        if (cookies > 0)
        {
            CookieBelly=true;
        }
        else {
            CookieBelly=false;
            throw new PendingException();
            }
    }
    @When("^I wait (\\d+) hour$")
    public void i_wait_hour(int hour) {
        if (hour < 0)
        {
            belly = false;
            throw new PendingException();
        }else {
            belly =true;
        }

    }
    @Then("^my belly should growl$")
    public void my_belly_should_growl() {
        if(CookieBelly && belly)
        {

        }else{
            throw new PendingException();
            }
    }
}

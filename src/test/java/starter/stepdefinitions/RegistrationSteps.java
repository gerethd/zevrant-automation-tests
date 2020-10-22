package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.users.LoginUser;
import starter.steps.users.RegistrationUser;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class RegistrationSteps {

    @Steps
    private LoginUser loginUser;

    @Steps
    private RegistrationUser registrationUser;

    @And("^I navigate to the registration page$")
    public void iNavigateToTheRegistrationPage() {
        loginUser.clickLogin();
        loginUser.clickRegistrationPage();
    }

    @And("I click on a role")
    public void iClickOnARole() {
        registrationUser.clickAdminRole();
    }

    @When("I switch pages on role selection")
    public void iSwitchPages() {
        registrationUser.clickNextPage();
        registrationUser.clickPreviousPage();
    }

    @Then("the role should remain selected")
    public void theRoleShouldRemainSelected() {
        assertThat(registrationUser.isAdminRoleSelected(), is(true));
    }
}

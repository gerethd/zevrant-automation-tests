package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.users.DnDUser;

public class DnDSteps {

    @Steps
    private DnDUser dnDUser;


    @When("I navigate to the D&D application")
    public void iNavigateToTheDnDApplication() {
        dnDUser.navigatetoDnD();
    }


    @And("I create a test campaign")
    public void iCreateATestCampaign() {
        dnDUser.createCampaign();

    }

    @Then("I should be able to navigate to the new campaign")
    public void iShouldBeAbleToNavigateToTheNewCampaign() {
        dnDUser.testCampaignExists();
    }

    @And("then I delete the created campaign")
    public void thenIDeleteTheCreatedCampaign() {
        dnDUser.deleteTestCampaign();
    }

}

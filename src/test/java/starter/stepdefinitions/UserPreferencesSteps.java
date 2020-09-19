package starter.stepdefinitions;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.steps.users.LoginUser;
import starter.steps.users.SettingsUser;

public class UserPreferencesSteps {

    @Steps
    private LoginUser loginUser;

    @Steps
    private SettingsUser settingsUser;

    @And("I navigate to the user settings menu")
    public void iNavigateToTheUserSettingsMenu() {
        loginUser.clickUserMenu();
        loginUser.clickAccountPage();
    }


    @And("I set my email address to be empty")
    public void iSetMyEmailAddressToBeEmpty() {
        settingsUser.setEmailAddress("");
    }

    @And("I submit my settings changes")
    public void iSubmitMySettingsChanges() {
        settingsUser.submitSettings();
    }


}

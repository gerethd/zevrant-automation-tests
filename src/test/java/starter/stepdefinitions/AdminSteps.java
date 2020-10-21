package starter.stepdefinitions;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.steps.users.AdminUser;

public class AdminSteps {

    @Steps
    private AdminUser adminUser;

    @And("^I navigate to the admin page$")
    public void navigateToAdminPage() {
        adminUser.clickAdminPage();
    }


    @And("I give myself the D&D role")
    public void iGiveMyselfThePrintsRole() {
        adminUser.clickDnDCheckbox();
        adminUser.clickSave();
    }

    @And("I give myself the D&D-admin role")
    public void iGiveMyselfTheDDAdminRole() {
        adminUser.clickDnDAdminCheckbox();
        adminUser.clickSave();
    }
}

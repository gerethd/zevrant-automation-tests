package starter.steps.users;

import net.thucydides.core.annotations.Step;
import starter.pages.RegistrationPage;

public class RegistrationUser {

    private RegistrationPage registrationPage;

    @Step
    public void clickAdminRole() {
        registrationPage.clickAdminRole();
    }

    @Step
    public void clickNextPage() {
        registrationPage.clickNextPage();
    }

    @Step
    public void clickPreviousPage(){
        registrationPage.clickPreviousPage();
    }

    @Step
    public boolean isAdminRoleSelected() {
        return registrationPage.isRoleStillSelected();
    }
}

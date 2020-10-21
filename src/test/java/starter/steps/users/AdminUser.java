package starter.steps.users;

import starter.pages.AdminPage;
import starter.pages.HomePage;

public class AdminUser {

    private AdminPage adminPage;
    private HomePage homePage;

    public void clickAdminPage() {
        homePage.clickAdminPage();
    }

    public void clickDnDCheckbox() {
        adminPage.clickDndCheckbox();
    }

    public void clickDnDAdminCheckbox() {
        adminPage.clickDndAdminCheckbox();
    }

    public void clickSave() {
        adminPage.clickSave();
    }
}

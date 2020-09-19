package starter.steps.users;

import starter.pages.SettingsPage;

public class SettingsUser {

    private SettingsPage settingsPage;

    public void setEmailAddress(String emailAddress) {
        settingsPage.clearEmail(emailAddress);
    }

    public void submitSettings() {
        settingsPage.submitSettings();
    }
}

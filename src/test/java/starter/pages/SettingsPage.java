package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class SettingsPage extends PageObject {

    @FindBy(id = "email")
    private WebElementFacade email;

    @FindBy(id = "settingsSubmit")
    private WebElementFacade submit;

    public void clearEmail(String emailAddress) {
        email.clear();
    }

    public void submitSettings() {
        submit.click();
    }
}

package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegistrationPage extends PageObject {

    @FindBy(id = "admin")
    private WebElementFacade adminRole;

    @FindBy(css = ".mat-paginator-navigation-next")
    private WebElementFacade nextPage;

    @FindBy(css = ".mat-paginator-navigation-previous")
    private WebElementFacade previousPage;

    public void clickAdminRole() {
        adminRole.click();
    }

    public void clickNextPage() {
        nextPage.click();
    }

    public void clickPreviousPage() {
        previousPage.click();
    }

    public boolean isRoleStillSelected() {
        return "true".equals(adminRole.getAttribute("ng-reflect-checked"));
    }
}

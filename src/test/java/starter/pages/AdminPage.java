package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends PageObject {

    @FindBy(id = "test-admin-D&D")
    private WebElementFacade dndCell;

    @FindBy(id = "test-admin-D&D-admin")
    private WebElementFacade dndAdminCell;

    @FindBy(id = "save")
    private WebElementFacade save;

    public void clickDndCheckbox() {
        waitABit(5000);
        WebElementFacade input = dndCell.find(By.tagName("input"));
        WebElementFacade div = dndCell.find(By.tagName("div"));
        if(input.getAttribute("aria-checked").equals("false")) {
            div.click();
        }

    }

    public void clickSave() {
        save.click();
    }

    public void clickDndAdminCheckbox() {
        waitABit(5000);
        WebElementFacade input = dndAdminCell.find(By.tagName("input"));
        WebElementFacade div = dndAdminCell.find(By.tagName("div"));
        if(input.getAttribute("aria-checked").equals("false")) {
            div.click();
        }
    }
}

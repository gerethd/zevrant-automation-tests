package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;


public class HomePage extends PageObject {

  @FindBy(id = "login")
  private WebElementFacade loginButton;

  @FindBy(id = "userMenu")
  private WebElementFacade userMenu;

  @FindBy(id = "appsMenu")
  private WebElementFacade appsMenu;

  @FindBy(id= "D&D")
  private WebElementFacade dndMenu;

  @FindBy(id = "settings")
  private WebElementFacade account;

  @FindBy(id = "adminPage")
  private WebElementFacade admin;

  public void clickLogin() {
    loginButton.click();
  }

  public String getUsername() {
    super.waitABit(5000);
    return userMenu.getWrappedElement().getText();
  }

  public void clickUserMenu() {
    userMenu.click();
  }

  public void clickAppsMenu() {
    appsMenu.click();
  }

  public void navigatetoDnD() {
    dndMenu.click();
  }

  public void clicAccountButton() {
    account.click();
  }

  public void clickAdminPage() {
    admin.click();
  }
}

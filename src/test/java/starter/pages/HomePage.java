package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;


public class HomePage extends PageObject {

  @FindBy(id = "loginButton")
  private WebElementFacade loginButton;

  @FindBy(id = "userMenu")
  private WebElementFacade userMenu;

  public void clickLogin() {
    loginButton.click();
  }

  public String getUsername() {
    return userMenu.getWrappedElement().getText();
  }

  public void getUserMenu() {
    userMenu.click();
  }

}

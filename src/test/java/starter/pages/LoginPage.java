package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

  @FindBy(id = "username")
  private WebElementFacade usernameField;

  @FindBy(id = "password")
  private WebElementFacade passwordField;

  @FindBy(id = "loginSubmit")
  private WebElementFacade submitButton;

  public void typeUsername(String username) {
    usernameField.sendKeys(username);
  }

  public void typePassword(String password) {
    passwordField.sendKeys(password);
  }

  public void submitLogin() {
    submitButton.click();
  }
}

package starter.steps.users;

import net.thucydides.core.annotations.Step;
import starter.pages.HomePage;
import starter.pages.users.LoginPage;

public class LoginUser {

  private HomePage homePage;

  private LoginPage loginPage;

  public void clickLogin() {
    homePage.clickLogin();
  }

  @Step
  public void typeUsername(String username) {
    loginPage.typeUsername(username);
  }

  @Step
  public void typePassword(String password) {
    loginPage.typePassword(password);
  }

  @Step
  public void clickSubmit() {
    loginPage.submitLogin();
  }

  @Step
  public String getUsername() {
    return homePage.getUsername();
  }

}

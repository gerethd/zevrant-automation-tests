package starter.steps.users;

import net.thucydides.core.annotations.Step;
import starter.pages.HomePage;
import starter.pages.LoginPage;

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

  @Step
  public void clickUserMenu() {
    homePage.clickUserMenu();
  }

  @Step
  public void clickAccountPage(){
    homePage.clicAccountButton();
  }

  @Step
  public void clickRegistrationPage(){
    loginPage.clickRegistrationButton();
  }

}

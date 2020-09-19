package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.WebDriver;
import starter.services.SecretsManager;
import starter.steps.users.LoginUser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class LoginSteps {

  @Steps
  private LoginUser loginUser;

  private EnvironmentVariables environmentVariables;

  @Managed
  private WebDriver webDriver;

  @Steps
  private SecretsManager secretsManager;

  @And("^I click the login button$")
  public void iClickTheLoginButton() {
    loginUser.clickLogin();
  }

  @When("^I type the username and password in$")
  public void iTypeTheUsernameAndPasswordIn() {
    loginUser.typeUsername(secretsManager.getSecret("/dev/ui/test/username"));
    loginUser.typePassword(secretsManager.getSecret("/dev/ui/test/password"));
  }

  @And("^I click submit$")
  public void iClickSubmit() {
    loginUser.clickSubmit();
  }

  @Then("^I should be able to see my username where the login button was$")
  public void iShouldBeAbleToSeeMyUsernameWhereTheLoginButtonWas() {
    assertThat(loginUser.getUsername(), is(secretsManager.getSecret("/dev/ui/test/username")));
  }

  @Given("I navigate to the application")
  public void iNavigateToTheApplication() {
    String webserviceEndpoint =  EnvironmentSpecificConfiguration.from(environmentVariables)
            .getProperty("webdriver.base.url");
    webDriver.navigate().to(webserviceEndpoint);
  }

  @Given("I have logged into the application")
  public void iHaveLoggedIntoTheApplication() {
    iNavigateToTheApplication();
    loginUser.clickLogin();
    loginUser.typeUsername(secretsManager.getSecret("/dev/ui/test/username"));
    loginUser.typePassword(secretsManager.getSecret("/dev/ui/test/password"));
    loginUser.clickSubmit();
  }
}

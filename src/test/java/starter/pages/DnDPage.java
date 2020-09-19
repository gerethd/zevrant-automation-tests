package starter.pages;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class DnDPage extends PageObject {

    @FindBy(id = "createCampaign")
    private WebElementFacade createCampaign;

    @FindBy(id = "campaignName")
    private WebElementFacade campaignName;

    @FindBy(id = "ruleset")
    private WebElementFacade ruleset;

    @FindBy(id = "frequency")
    private WebElementFacade frequency;

    @FindBy(id = "startDate")
    private WebElementFacade startDate;

    @FindBy(id = "startTime")
    private WebElementFacade startTime;

    @FindBy(id = "timezone")
    private WebElementFacade timezone;

    @FindBy(id = "campaignSubmit")
    private WebElementFacade campaignSubmit;

    @FindBy(id = "test user automation")
    private WebElementFacade testCampaign;

    @FindBy(id = "deleteCampaign")
    private WebElementFacade deleteCampaign;

    public void clickCreateCampaign() {
        createCampaign.click();
    }

    public void typeCampaignName(String campaignName) {
        this.campaignName.sendKeys(campaignName);
    }

    public void typeRuleset(String ruleset) {
        this.ruleset.sendKeys(ruleset);
    }

    public void typeFrequency(String frequency) {
        this.frequency.sendKeys(frequency);
    }

    public void typeStartDate(String startDate) {
        this.startDate.sendKeys(startDate);
    }

    public void typeStartTime(String startTime) {
        this.startTime.sendKeys(startTime);
    }

    public void selectTimezone(int timezone) {
        this.timezone.getElement().click();
        findAll(By.tagName("mat-option")).get(timezone).click();
    }

    public void clickCampaignSubmit() {
        this.campaignSubmit.click();
    }

    public String getCampaignNamed(String test_user_automation) {
        return testCampaign.getElement().findElement(By.tagName("h3")).getText();
    }

    public void deleteTestCampaign() {
        deleteCampaign.click();
    }
}

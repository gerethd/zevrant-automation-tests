package starter.steps.users;

import starter.pages.DnDPage;
import starter.pages.HomePage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DnDUser {

    private HomePage homePage;
    private DnDPage dnDPage;


    public void navigatetoDnD() {
        homePage.clickAppsMenu();
        homePage.navigatetoDnD();
    }

    public void createCampaign() {
        dnDPage.clickCreateCampaign();
        dnDPage.typeCampaignName("test user automation");
        dnDPage.typeRuleset("test ruleset");
        dnDPage.typeFrequency("once a week");
        dnDPage.typeStartDate("7/25/2020");
        dnDPage.typeStartTime("09:12");
        dnDPage.selectTimezone(1);
        dnDPage.clickCampaignSubmit();
    }

    public void testCampaignExists() {
        assertThat(dnDPage.getCampaignNamed("test user automation"), is("test user automation"));
    }

    public void deleteTestCampaign() {
        dnDPage.deleteTestCampaign();
    }
}

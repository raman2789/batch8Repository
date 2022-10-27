package glue;

import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import pages.HomePage;

public class HomePageGlue {
    @Then("verify mandatory fileds")
    public void verifyMandatoryFileds() {
        HomePage homePage = new HomePage();
//       boolean b =  homePage.mandatoryFildsDisplayed();
//        Assert.assertTrue(b);

        //FileUtils.copyFile();
        homePage.enterSearchText("lsjflsdjlfsdllsdjlfds");
        homePage.clickOnSearchButton();
    }

}

package Steps;

import Base.BaseUtil;
import Transformation.CountTransformer;
import Transformation.EmailTransformer;
import classes.PageAssert;
import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by mboychuk on 2/24/2017.
 */
public class NavigateChapter1 extends BaseUtil {

    private BaseUtil base;

    public NavigateChapter1(BaseUtil base) {
        this.base = base;
    }

    @Given("^Navigate to home page$")
    public void navigateToHomePage() throws Throwable {
        System.out.println("Navigated to homepage");
    }

    @And("^Click on link Chapter$")
    public void clickOnLinkChapter() throws Throwable {
        System.out.println("You've clicked on Chapter1");
    }

    @Then("^I should see following text on page Chapter$")
    public void iShouldSeeFollowingTextOnPageChapterAssertString(DataTable table) throws Throwable {

        List<PageAssert> asserts = new ArrayList<PageAssert>();
        asserts = table.asList(PageAssert.class);

        for (PageAssert asrt : asserts) {
            System.out.println("Text is " + asrt.getAssertString());
        }

        //throw new AssertionError("Failure!");
    }

    @Then("^I should see following text on page Chapter ([^\"]*)$")
    public void iShouldSeeFollowingTextOnPageChapterAssertString(String asrt) throws Throwable {
        System.out.println("Outline! Text is " + asrt);
        System.out.println("Driver is " + base.stepInfo);
    }

    @And("^I enter e-mail address as Email:([^\"]*)$")
    public void iEnterEMailAddressAsEmailAdmin(@Transform(EmailTransformer.class) String email) throws Throwable {

       System.out.println("E-mail is: " + email);

    }

    @And("^I will try to count digits in integer (\\d+)$")
    public void iWillTryToCountDigitsInInteger(@Transform(CountTransformer.class) int num) throws Throwable {
        System.out.println("Number of digits in 15236 is " + num);
    }
}

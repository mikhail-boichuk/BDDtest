package Steps;

import classes.PageAssert;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by mboychuk on 2/24/2017.
 */
public class NavigateChapter1 {
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

    }

    @Then("^I should see following text on page Chapter ([^\"]*)$")
    public void iShouldSeeFollowingTextOnPageChapterAssertString(String asrt) throws Throwable {
            System.out.println("Outline! Text is " + asrt);

    }
}

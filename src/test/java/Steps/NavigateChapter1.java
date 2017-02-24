package Steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

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
        System.out.println("You've clicked on Chapter1\n");
    }

    @Then("^I should see following text on page Chapter$")
    public void iShouldSeeFollowingTextOnPageChapter(DataTable table) throws Throwable {
        System.out.println("Text is " + table.raw().get(1).get(0));
    }
}

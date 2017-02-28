package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


/**
 * Created by mboychuk on 2/28/2017.
 */
public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void initializeTest() {
        System.out.println("<-- This step performed before test -->\nOpening browser: MOCK");

        base.stepInfo = "SomeDriver";
    }

    @After
    public void tearDownTest(Scenario scenario) {
        System.out.println("Closing browser: MOCK\n<-- This step performed after test -->");

        if (scenario.isFailed()) {
            System.out.println("ACHTUNG! " + scenario.getName() + " is failed!");
        } else {
            System.out.println("COOL! " + scenario.getName() + " passed!");
        }
    }

}

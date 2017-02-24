package classes;

/**
 * Created by mboychuk on 2/24/2017.
 */
public class PageAssert {
    private String assertString;

    public PageAssert(String assertString) {
        setAssertString(assertString);
    }

    private void setAssertString(String string) {
        this.assertString = string;
    }

    public String getAssertString() {
        return this.assertString;
    }

}

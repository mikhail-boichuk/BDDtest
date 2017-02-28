package Transformation;

import cucumber.api.Transformer;

/**
 * Created by mboychuk on 2/28/2017.
 */
public class EmailTransformer extends Transformer<String> {

    @Override
    public String transform(String email) {
        return email.concat("@test.com");
    }
}

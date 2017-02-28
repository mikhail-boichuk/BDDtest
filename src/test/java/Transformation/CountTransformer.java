package Transformation;

import cucumber.api.Transformer;

/**
 * Created by mboychuk on 2/28/2017.
 */
public class CountTransformer extends Transformer<Integer> {

    @Override
    public Integer transform(String number) {
        return number.length();
    }
}

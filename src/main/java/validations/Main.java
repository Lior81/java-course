package validations;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evegeny on 24/11/2016.
 */
public class Main {
    public static void main(String[] args) {
        List<Validator> validators = new ArrayList<>();
        validators.add(new ForbiddenWordsValidator());
        validators.add(new LengthValidator());
        validators.add(new MandatoryWordsValidator());

        ValidatorAggregator aggregator = new ValidatorAggregator(validators);
        String line = "spark, spark, WTF";
        String validations = aggregator.getValidations(line);
        System.out.println("validations = " + validations);


    }
}




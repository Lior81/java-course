package validations;

import lombok.AllArgsConstructor;

import java.util.List;

/**
 * Created by Evegeny on 24/11/2016.
 */
public class ValidatorAggregator {
    private List<Validator> validators;

    public ValidatorAggregator(List<Validator> validators) {
        this.validators = validators;
    }

    public String getValidations(String line) {
        String validationsMessage = "";
        for (Validator validator : validators) {
            String message = validator.validate(line);
            validationsMessage += ", " + message;
        }
        return validationsMessage;
    }
}




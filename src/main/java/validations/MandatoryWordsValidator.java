package validations;

/**
 * Created by Evegeny on 24/11/2016.
 */
public class MandatoryWordsValidator implements Validator {
    @Override
    public String validate(String line) {
        if (!line.contains("spark")) {
            return "spark is missing";
        }
        return "";
    }
}

package validations;

/**
 * Created by Evegeny on 24/11/2016.
 */
public class LengthValidator implements Validator {
    @Override
    public String validate(String line) {
        if (line.length() == 0) {
            return "line is empty";
        }else {
            return "";
        }
    }
}

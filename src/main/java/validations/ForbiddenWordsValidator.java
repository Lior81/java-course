package validations;

/**
 * Created by Evegeny on 24/11/2016.
 */
public class ForbiddenWordsValidator implements Validator {
    @Override
    public String validate(String line) {
        if (line.contains("WTF")) {
            return "forbiden words are int the line";
        }
        return "";
    }
}

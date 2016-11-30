package lab1;

/**
 * Created by Evegeny on 30/11/2016.
 */
public class PersonService {
    public boolean isPersonAdult(Person person) {
        return person.getAge() > 18;
    }
}

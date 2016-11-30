package zoo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evegeny on 24/11/2016.
 */
public class ZooFactory {


    public List<Animal> createZoo() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cat());
        animals.add(new Horse());
        animals.add(new Horse());
        return animals;
    }
}

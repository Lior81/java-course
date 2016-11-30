package zoo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evegeny on 24/11/2016.
 */
public class Main {
    public static void main(String[] args) {
        ZooFactory zooFactory = new ZooFactory();
        List<Animal> zoo = zooFactory.createZoo();

        zoo.forEach(Animal::makeVoice);

        for (Animal animal : zoo) {
            animal.makeVoice();
        }

        for (int i = 0; i < zoo.size(); i++) {
            Animal animal = zoo.get(i);
            animal.makeVoice();

        }
    }
}

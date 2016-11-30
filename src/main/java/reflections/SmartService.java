package reflections;

import lab1.Person;
import zoo.Animal;
import zoo.Dog;

/**
 * Created by Evegeny on 30/11/2016.
 */
public class SmartService {
    public boolean isPerson(Object o) {
        return o instanceof Person;
    }

    public void doSomethingWithObject(Object o) {
        if (o instanceof Animal) {
            Animal animal = (Animal) o;
            animal.makeVoice();

        }
    }


    public static void main(String[] args) {
        Dog dog = new Dog();
        SmartService smartService = new SmartService();
        smartService.doSomethingWithObject(dog);

    }




}

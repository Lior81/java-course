package data;


import lab1.Address;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by Evegeny on 24/11/2016.
 */
@Getter
public class Person implements Serializable{
    public static int counter;

    @Setter
    private String name;
    @Setter
    private transient int age;

    private boolean isAlchogolist;



    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        checkIfNegative(age);
        this.age = age;
    }

    private void checkIfNegative(int age) {
        if (age < 0) {
            throw new RuntimeException("age can't be negative");
        }
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

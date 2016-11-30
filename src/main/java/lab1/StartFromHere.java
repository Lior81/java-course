package lab1;

import javax.swing.*;

/**
 * Created by Evegeny on 30/11/2016.
 */
public class StartFromHere {
    public static void main(String[] args) {
        Address address = new Address("nadiv", 71);
//        Person person = new Person("Ella", 22, address);
        Person person = new Person();
        person.setAddress(address);
        person.setName("Ella");
        int age = Integer.parseInt(JOptionPane.showInputDialog("input your age"));
        person.setAge(age);
        System.out.println("person = " + person);

        if (person.isAdult()) {
            System.out.println("Take the beer");
        }
        else {
            System.out.println("not for the children");
        }


    }
}

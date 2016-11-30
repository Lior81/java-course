package data.stam;

import data.Person;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

/**
 * Created by Evegeny on 24/11/2016.
 */
public class MainForRead {
    public static void main(String[] args) throws Exception {
        File file = new File("c:\\temp\\abcd.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fileInputStream);
        Person person = (Person) ois.readObject();
        System.out.println(person);

    }
}

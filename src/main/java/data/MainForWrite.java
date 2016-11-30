package data;

import data.stam.MyStam;
import strategy.Alarm;
import strategy.RadioAlarm;
import strategy.RussianAlarm;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Evegeny on 24/11/2016.
 */
public class MainForWrite {
    public static void main(String[] args) throws Exception {
        Person person = new Person("Noa",17);
        person.setAge(10);
        File file = new File("c:\\temp\\abcd.txt");
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
        oos.writeObject(person);
        /*DataOutputStream dos = new DataOutputStream(fileOutputStream);
        dos.writeUTF(person.getName());*/

     /*   List<Alarm> alarms = new ArrayList<>();

        alarms.add(new RadioAlarm());
        alarms.add(new RussianAlarm());

        Math.log(10);

        ArrayList<String> words = new ArrayList<String>();
        words.add("Noa");
        words.add("Tomer");
        words.add("Sigalit");
        words.add("Ivan");

        System.out.println("dsfjshdk");

        words.forEach(System.out::println);

        for (String word : words) {
            if (word.equalsIgnoreCase("mama")) {
                continue;
            }
            System.out.println(word);

        }

        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            System.out.println(word);

        }




        System.out.println(person);
*/    }
}

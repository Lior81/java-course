package inheritance;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Evegeny on 30/11/2016.
 */
@Setter
@Getter
public class Parent {
    private int age;

    public Parent(int age) {
        this.age = age;
    }

    protected void stam(){
        System.out.println("stam");
    }


}

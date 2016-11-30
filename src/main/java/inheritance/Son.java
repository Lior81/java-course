package inheritance;

import lombok.Data;

/**
 * Created by Evegeny on 30/11/2016.
 */
@Data
public class Son extends Parent {
    private String name;

    public Son(int age, String name) {
        super(age);
        this.name = name;
    }

    @Override
    public void stam() {
        System.out.println("STAM");
    }
}

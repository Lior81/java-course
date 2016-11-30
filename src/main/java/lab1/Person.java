package lab1;

import lombok.*;

/**
 * Created by Evegeny on 30/11/2016.
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {
    private String name;
    private int age;
    private Address address;

    public boolean isAdult() {
        return age>18;
    }
}

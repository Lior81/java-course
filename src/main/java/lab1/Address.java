package lab1;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by Evegeny on 30/11/2016.
 */
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Address {
    private String streetName;
    private int houseNumber;

    public Address(String streetName, int houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

}

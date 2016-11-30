package immutable;

import lombok.Getter;

/**
 * Created by Evegeny on 30/11/2016.
 */
@Getter
public class ImmutablePerson {
    private final String name;
    private final int age;

    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ImmutablePerson addAge(int delta) {
        return new ImmutablePerson(name, age + delta);
    }
}

package JavaChallenges.EqualsHashCode;

import java.util.Objects;

public class Person {
    private String Name;
    private int age;

    public Person(String name, int age) {
        Name = name;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(Name, person.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, age);
    }
}

package JavaChallenges;

public class StudentToStraing {

    String name;
    int age ;

    public StudentToStraing(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentToStraing{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        StudentToStraing student = new StudentToStraing("Akhtar",24);
        System.out.println(student);

    }
}

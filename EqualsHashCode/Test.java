package JavaChallenges.EqualsHashCode;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Akhtar",24);
        Person person2 = new Person("Akhtar",22);

        if(person1.equals(person2)){
            System.out.println("Equal");
        }else{
            System.out.println("Not equals");
        }
    }
}

package JavaChallenges;
//class Parent{
//    String name = "parent";
//    String message(){
//        return "from Parent";
//    }
//  public class Child extends Parent{
//        String name = "child";
//        String message(){
//            return "from Child";
//        }
//    }
//}
//class Sweet{
//    void price(){
//        System.out.println("sweet = 10$");
//    }
//}
//class Sugar extends Sweet{
//    @Override
//    void price() {
//        super.price();
//        System.out.println("sugar = 20$");
//    }
//}

class A{
    int i;
    void display(){
        System.out.println(i);
    }
}
class B extends A{
    int j;

    void display() {
        //super.price();
        System.out.println(j);
    }
}

public class Main {
    public static void main(String[] args) {
       // Parent p= new Child();
        //Sugar su= new Sugar();
       // su.price();
        B obj = new B();
        obj.i=1;
        obj.j=2;
        obj.display();

       // System.out.println(p.name+"Hello world!"+p.message());
    }
}
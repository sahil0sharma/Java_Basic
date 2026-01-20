package JAVA_8.Default_and_static_method_in_inheritance;

interface A {
    default void sayHello(){
        System.out.println("A hello");
    }
}
interface B {
    default void sayHello(){
        System.out.println("B hello");
    }
}
public class Ambiguity_problem implements B,A {
    public static void main(String[] args) {
        Ambiguity_problem a = new Ambiguity_problem();
        a.sayHello();

    }

    @Override
    public void sayHello() {
        B.super.sayHello();  // if want to specific method
    }

//    public void sayHello(){
//        System.out.println("OWN implementation of implementing class");
//    }
}

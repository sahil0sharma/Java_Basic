package JAVA_8.Inheritance_in_functional_interface;

@FunctionalInterface
interface A {
    public void sayHello();
}
@FunctionalInterface
interface B extends A { // not usefull because its the same thing like writing interface A if want to go with functional interface
//    public void oK(); cant write because this break Functional interface rule of having only single abstract method
      public void sayHello();

}
public class Demo implements B {
    public static void main(String[] args) {


    }
    @Override
    public void sayHello() {
        System.out.println("hello form main cLass");
    }
}

package JAVA_8.Default_and_static_method_in_inheritance;

import org.w3c.dom.ls.LSOutput;

@FunctionalInterface
interface demo{
    void sayHello();

    default void hello(){
        System.out.println("Default Hello");
    }
    default String sayOK(){
        return "I am Default OK";
    }
    static void hiHello(){
        System.out.println("Static Hello");
    }

    // for functional interface the interface can have one single abstract method
    // and multiple Default and Static methods
}

interface Parent {
    default void meth1(){
        System.out.println("Parent method ");
    }
}

class child implements Parent{
    @Override
    public void meth1(){                               // for OWN IMPLEMENTATION of child class
        System.out.println("OWN implementation of child class");
    }
             //  Or
//    public void meth1(){
//        Parent.super.meth1();            // if want to call parent method
//    }
}
public class default_methods {
    public static void main(String[] args) {
        Parent p = new child();
        p.meth1();
    }
}



package Practice.file3.Abstraction;
abstract class A{


//        void method2 () {
//            System.out.println("M1");    cant do this because abstract defination is no body only idea
//        }                                method kahi aur banega aur ye concrete class ban jaygi
//                                         --concrete matlab fix hai , implement hoga hi hoga



    void method1 () {
        System.out.println("M1");
    }

    abstract void method2();
}

class B extends A {
    void method2() {
        System.out.println("M2");

    }
}
public class Abstratclass {
    public static void main(String[] args){

        A abc  = new B();
        abc.method1();  // can access from parent class
        abc.method2();  // / can access from Base class

    }
}

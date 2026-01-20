package JAVA_8.Lambda;

interface A{
    String sayHello();
}
public class how_to_use_le {
    public static void main(String[] args) {

//        A a = new how_to_use_le();
//        System.out.println(a.sayHello());
                    // OR
        A a = () -> "hello Lambda Expression";
        System.out.println(a.sayHello());

    }

//    @Override
//    public String sayHello() {
//        return "Hello";
//    }
}

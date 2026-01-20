package JAVA_8.Lambda;

@FunctionalInterface
interface First_lambda{
    String hello();
}

@FunctionalInterface
interface Second_lambda{
    void hello();
}

@FunctionalInterface
interface Third_lambda{
    int add(int a, int b);
}

public class Lambda_Expression {
    public static void main(String[] args) {

        First_lambda fl = () -> "hello from first lambda expression";
        System.out.println(fl.hello());

        Second_lambda sl = () -> {
            System.out.println("HELLO from second lambda expression");
        };
        sl.hello();

        Third_lambda tl = (a,b) -> a+b;
        System.out.println(tl.add(3,4));
    }
}

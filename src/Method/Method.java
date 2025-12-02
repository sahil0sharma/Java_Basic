package Method;


public class Method {

    void greet(String x){
        String a = "!";
        System.out.println("hello morining" + x); // this is method
    }

    void greet(String x,String y){
        System.out.println("hello good morining" + x + y); // this is method overloading
        // same name sifferent parameter
    }

    public static void main(String[] args) {
        //everything is method because everything is under class

        Method m = new Method();

        m.greet("!");
        m.greet("!","!");

    }
}

package Method;

class car{
    String name; // property that tells the name of car
}
public class Object_passing {
    static String brand(car c) {
        c.name = "audi";
        return c.name;
    }

    public static void main(String[] args) {

        car c = new car();
        c.name = "BMW";
        brand(c);
        System.out.println(brand(c)); // without return type in method this syntax is wrong because there is noting to call
        System.out.println(c.name);


    }
}
//STACK:                HEAP:
//--------              ---------------------
//car -------> (ref) -> Car object { model = "Audi" }
//
//change(car) called
//
//c --------> (ref copy) -> Car object { model = "BMW" }
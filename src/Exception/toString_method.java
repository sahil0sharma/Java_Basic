package Exception;


class test {

    public String name;
    public int age;

    public test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name : " + name + " Age : " + age;
    }
}
public class toString_method {
    public static void main(String[] args) {

        // toString is a method of object class
        // in java implicitly every or most of class inherit object class
        // and some override too

        test t = new test("Sahil" ,19);
        System.out.println(t);

    }
}

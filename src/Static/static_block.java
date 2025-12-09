package Static;


public class static_block {

    static {
        System.out.println("static block");
    }
    public static void main(String[] args) {
        System.out.println("main method");

        Student s5 = new Student();
        static_member_and_method.display(); // static method can also call from different class


        System.out.println(myUtils.name("sahil"));  // call from utility class

    }
}

//static block  -> always static block run first
//main method
//1
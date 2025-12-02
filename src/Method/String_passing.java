package Method;

public class String_passing {

    static String name(String str){
    return str.toUpperCase();
    }

    public static void main(String[] args) {

        String a = "sahil";
        System.out.println(name(a)); // gives upper case letter
        System.out.println(a);   // gives small letter

    }

}

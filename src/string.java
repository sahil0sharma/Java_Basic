import java.lang.String;
public class string {
    public static void main(String[] args) {
        String a = new String("Ram");     // This store in heap memory
        String c = new String("Ram");
        System.out.println( a == c);              //--> flase and it checks reference not actual value

        String b = "ram";  //--> this store in string map pool
        String d = "ram";
        System.out.println(b == d); // true

    }
}

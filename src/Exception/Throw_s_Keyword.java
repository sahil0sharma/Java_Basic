package Exception;
public class Throw_s_Keyword {

    static void age(int a) throws Exception {
        if (a < 18) {
            throw new Exception("Age must be 18 or above");
        }
        System.out.println("Eligible age");
    }

    public static void main(String[] args) {
        try {
            age(12);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

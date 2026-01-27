package Exception;

public class Finally_keyword {
    static void Fage(int a) throws Exception {
        if (a < 18) {
            throw new Exception("Age must be 18 or above");
        }
        System.out.println("Eligible age");
    }

    public static void main(String[] args) throws Exception {

        try {
            Finally_keyword.Fage(12);
        } finally {
            System.out.println("Finally block");
        }
    }

    // If you use finally without catch, the exception must be either caught or declared using throws; otherwise the code won’t compile.
}

package Exception;

public class Throw_Keyword {

    static void validateAge(int a){
        if(a < 18){
            throw new IllegalArgumentException("age cannot below than 18");
        }
        System.out.println("eligible age ");
    }
    public static void main(String[] args) {

        try {
            Throw_Keyword.validateAge(12);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());  // explicitly calling message
        }
    }
}

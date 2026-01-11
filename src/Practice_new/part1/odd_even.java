package Practice_new.part1;

public class odd_even {

    public static String oddEven(int number){

        if(number % 2 == 0){
            return "even";
        }
        else {
            return "odd";
        }
    }

    public static void main(String[] args) {
        int n = -5;
        System.out.println(odd_even.oddEven(n));;
    }
}

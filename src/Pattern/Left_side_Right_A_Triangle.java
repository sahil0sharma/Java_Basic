package Pattern;
//    *
//   **
//  ***
// ****
//*****
import java.util.Scanner;
public class Left_side_Right_A_Triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of rows ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // print spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}


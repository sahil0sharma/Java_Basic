package Pattern;
//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15
import java.util.Scanner;
public class Floyed_Triangle {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the no. of rows ");
        int n = s.nextInt();

        int num = 1;
        for ( int i = 1; i<=n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(num + " " );
                num++;
            }
            System.out.println();
        }
    }
}

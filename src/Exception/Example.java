package Exception;

import javax.swing.plaf.basic.BasicSplitPaneDivider;

public class Example {
    public static void main(String[] args) {

        int[] numerator = {10, 200, 3000 , 40000};
        int[] denominator = { 1, 2, 0, 4 };


        for (int i = 0; i < numerator.length; i++) {
            try {
                System.out.println(numerator[i] / denominator[i]);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero at index " + i);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }

    }
}

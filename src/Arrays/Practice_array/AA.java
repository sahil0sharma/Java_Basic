package Arrays.Practice_array;

import java.sql.SQLOutput;
import java.util.Arrays;

public class AA {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 5;
        arr[3] = 1;
        arr[4] = 3;

        int sum = 0;
        int count_even = 0;
        int count_odd = 0;
        for(int i: arr){
            sum = sum + i;
            System.out.println(i);
            if (i % 2 == 0){
                count_even++;
            } else {
                count_odd++;
            }
        }
        System.out.println("sum of array is "+sum);
        System.out.println("Even count is " + count_even);
        System.out.println("Odd count is " + count_odd);

        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i < arr.length; i++){
            if( arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}

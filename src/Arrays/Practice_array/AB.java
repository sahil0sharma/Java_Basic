package Arrays.Practice_array;

import java.util.Arrays;
//Check if the array is sorted (ascending)
//
//Return true or false
public class AB {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        boolean sorted = true;

        for( int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i + 1]){
                sorted = false;
                break;
            }
        }

        System.out.println(sorted);

    }
}

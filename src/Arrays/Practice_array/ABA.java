package Arrays.Practice_array;
//Reverse the array in-place
//
//No extra array allowed
public class ABA {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int n = arr.length;

        for( int i = 0; i < arr.length / 2; i++){   // the divide is needed so not swap itself in third iteration
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        for( int i : arr){
            System.out.println(i);
        }
    }
}

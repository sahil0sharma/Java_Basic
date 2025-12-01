package Arrays;

public class Check_Sorted_array {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,7,6};
        boolean issorted = true;
        for (int i = 0; i < arr.length -1; i++){
                if(arr[i] > arr[i+1]){
                    issorted = false;
                    break;
                }
            }

        if(issorted){
            System.out.println("the array is sorted");
        }
        else System.out.println("the array is unsorted");

    }
}

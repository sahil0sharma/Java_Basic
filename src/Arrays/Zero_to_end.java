package Arrays;

public class Zero_to_end {
    public static void main(String[] args) {

        int[] arr = {0,0,3,4,5,6,7};

        for (int i = 0; i < arr.length; ){
             if( arr[i] != 0){

                 int temp  = arr[i];
                 arr[i] = arr[i+1];
                 arr[i+1] = temp;
             }
        }

        for(int i: arr){
            System.out.println(i);
        }


    }
}

package Arrays.Practice_array;
//Merge two arrays
//
//Keep all elements
public class ABB {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {6, 7, 8, 9, 10};
        int[] merge = new int[arr.length + arr1.length];

        int k = 0;
        for( int i = 0; i < arr.length ; i++){
            merge[k++] = arr[i];
        }
        for( int i = 0; i < arr1.length ; i++){
            merge[k++] = arr1[i];
        }

        for( int i : merge){
            System.out.println(i);
        }

    }
}

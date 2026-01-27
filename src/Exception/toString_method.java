package Exception;


class test {

    @Override
    public String toString() {
        return "i am a text ";
    }
}
public class toString_method {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}

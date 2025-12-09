package Static;

public class myUtils {

    public static int add(int x, int y){
        return x + y;
    }

    public static String name(String str){
        if(str != null){
            return str.toUpperCase();
        }else {
        return "empty";
    }
    }
    public static void main(String[] args) {

    }
}
// A utility class is a class that have small and basic repeated method in static so can use it anywhere
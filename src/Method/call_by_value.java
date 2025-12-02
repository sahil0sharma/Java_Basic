package Method;

public class call_by_value {
    //java uses call by value that pass the reference (address) of original value

    int num(int x){
        return ++x;  // this change will not inflict on original value
    }
    public static void main(String[] args) {

        call_by_value c = new call_by_value();
        int x = 10;
        c.num(x);
        System.out.println(c.num(x)); // 11
        System.out.println(x);        // 10 still ten
    }
}

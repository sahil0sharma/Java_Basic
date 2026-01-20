package Lambda_Expresssion;

@FunctionalInterface
interface car{
    public void show();
}

@FunctionalInterface
interface sum {
    public int add(int i , int j );
}
public class demo_lambda {
    public static void main(String[] args) {

        car c = () -> System.out.println("in car show");
        c.show();

        sum s = (i ,j) -> i+j;
        s.add(4,5);


    }
}

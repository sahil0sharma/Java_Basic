package JAVA_8.Lambda;
interface scope {
    void show();
}
public class Variable_scope_of_LE_and_AIC { // Lambda Expression and Anonymous Inner class

    int x = 2;  // instance variable can be used by lambda expression
    public static void main(String[] args) {
            Variable_scope_of_LE_and_AIC v = new Variable_scope_of_LE_and_AIC();
            v.DISPLAY();
    }
    public void DISPLAY() {
        scope s = () ->
        {
                int a = 10; // local variable
            System.out.println(this.x); // accesing instance variable
        };
        s.show();  // -> 2

        scope c = new scope(){
            int x = 5;
            @Override
            public void show() {
                System.out.println(this.x); // this is different x because it's a different class
            }
        };
        c.show();  //  -> 5
    }

}

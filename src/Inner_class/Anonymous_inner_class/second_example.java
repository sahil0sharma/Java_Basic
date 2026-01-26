package Inner_class.Anonymous_inner_class;


class A {
    int a = 10;

}
public class second_example {
    public static void main(String[] args) {

        A a = new A(){
          void show(){
              System.out.println("can acces the instance variable"+this.a);
            }
        };

    }
}

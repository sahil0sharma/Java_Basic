package Inner_class.Anonymous_inner_class;

public class test {
    public static void main(String[] args) {

        shopping_kart k = new shopping_kart(150);
        k.display(new Payment() {
            @Override
            public void pay() {
            }
        });
    }
    // by this we don't have to write extra class to implemnt interface of Payment
}

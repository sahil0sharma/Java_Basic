package Inner_class.Anonymous_inner_class;

public class shopping_kart {
    public int amount;

    public shopping_kart(int amount) {
        this.amount = amount;
    }

    public void display(Payment pay){
        System.out.println("the amount is paid " + this.amount);
    }
}

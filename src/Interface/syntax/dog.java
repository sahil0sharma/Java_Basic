package Interface.syntax;

public class dog implements Animal {
    @Override
    public void sound() {
        System.out.println("bark ");
    }

    @Override
    public void feature() {
        System.out.println("loyal" + " " + "legs " + legs);
    }
}

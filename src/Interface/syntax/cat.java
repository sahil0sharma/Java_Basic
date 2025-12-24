package Interface.syntax;

public class cat implements Animal{

    @Override
    public void sound() {
        System.out.println("meow ");
    }

    @Override
    public void feature() {
        System.out.println("flexible" + " " + "legs " + legs + "\n");
    }
}

package Interface.syntax;

public class Test {
    public static void main(String[] args) {

        Animal c = new cat();
        c.sound();
        c.feature();

        Animal d = new dog();
        d.sound();
        d.feature();
    }
}

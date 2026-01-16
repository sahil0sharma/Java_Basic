package Inner_class.Member_inner_class;

public class Test {
    public static void main(String[] args) {

        Car car = new Car("ford");
        Car.engine en = car.new engine();

        en.start();
        en.stop();

    }
}

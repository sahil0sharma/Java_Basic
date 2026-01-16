package Inner_class.Member_inner_class.second_method;

public class Test {
    public static void main(String[] args) {
        Car2 car = new Car2("ford");
        engine en = new engine(car);
        en.start();
        en.stop();
    }
}

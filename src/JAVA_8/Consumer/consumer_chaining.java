package JAVA_8.Consumer;

import java.util.function.Consumer;

public class consumer_chaining {
    public static void main(String[] args) {

        Consumer<String> c1 = s -> System.out.println(s.length());
        Consumer<String> c2 = s -> System.out.println((s.toUpperCase()));
        Consumer<String> c3 = c1.andThen(c2);

        c3.accept("sahil");







    }
}

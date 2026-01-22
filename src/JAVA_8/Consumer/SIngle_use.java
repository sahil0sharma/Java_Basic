package JAVA_8.Consumer;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class SIngle_use {
    public static void main(String[] args) {

        Consumer<String> c1 = n -> System.out.println(n);
        c1.accept("Sahil");

        Consumer<Integer> age = n -> {
            System.out.println(n);
        };
        age.accept(19);



    }
}

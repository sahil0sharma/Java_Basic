package JAVA_8.Predicate;

import java.util.function.Predicate;

public class single_use_case {
    public static void main(String[] args) {

        Predicate<Integer> isTrue = n -> n % 2 == 0;
        System.out.println(isTrue.test(8));
    }
}

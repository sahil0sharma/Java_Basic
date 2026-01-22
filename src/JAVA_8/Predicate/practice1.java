package JAVA_8.Predicate;

import java.util.function.Predicate;

public class practice1 {
    public static void main(String[] args) {

        Predicate<String> isTrue = n -> n == "c";
        System.out.println(isTrue.test("c"));
    }
}

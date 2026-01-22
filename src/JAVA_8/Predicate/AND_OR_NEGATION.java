package JAVA_8.Predicate;

import java.util.function.Predicate;

public class AND_OR_NEGATION {
    public static void main(String[] args) {

        Predicate<String> isEqual = n -> n.toLowerCase().charAt(0) == 's';
        Predicate<String> isTrue = n -> n.toLowerCase().charAt(n.length() - 1) == 'l';

        Predicate<String> ans = isEqual.and(isTrue);
        Predicate<String> ans1 = isEqual.or(isTrue);

        Predicate<String> ans2 = isEqual.negate();
        Predicate<String> ans3 = isTrue.negate();

        System.out.println(ans.test("sahil"));
        System.out.println(ans1.test("Rahul"));
        System.out.println(ans2.test("Sahil"));
        System.out.println(ans3.test("Sahil"));

    }
}

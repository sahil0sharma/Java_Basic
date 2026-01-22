package JAVA_8.Functions;

import java.util.function.Function;

public class single_use {
    public static void main(String[] args) {

        Function<Integer, Integer> function1 = n -> n * n;
        System.out.println(function1.apply(5));

        Function<String, Integer> function2 = s -> s.length();
        System.out.println("Length of String" + function2.apply("Sahil"));

        Function<String , String> function3 = s -> s.substring(0,3);
        Function<String , String> function4 = s -> s.toUpperCase();
        Function<String, String> function5 = function3.andThen(function4); // Using andThen
        System.out.println(function5.apply("Sahil"));


    }
}

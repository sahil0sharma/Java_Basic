package JAVA_8.Functions;

import java.util.function.Function;

public class Function_chaining {
    public static void main(String[] args) {

        Function<Integer, Integer> function1 = s -> 2 * s;
        Function<Integer, Integer> function2 = s -> s * s * s;

        Function<Integer, Integer> function3 = function1.andThen(function2);
        Function<Integer, Integer> function4 = function2.andThen(function1);

        System.out.println(function3.apply(2)); // 64
        System.out.println(function4.apply(2)); // 16

        Function<Integer, Integer> square = n -> n * n;
        Function<Integer, Integer> cube = n -> n * n;
        Function<Integer, Integer> result = square.andThen(cube);
        System.out.println(result.apply(2)); // 16

        // andThen is used to chain the function the output of first function becomes the input of second function
        // so that's why in this program the function 1 becomes the answer of second function
    }
}

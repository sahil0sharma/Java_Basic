package JAVA_8.Consumer;

import java.util.List;
import java.util.function.Consumer;

public class Collection_use {
    public static void main(String[] args) {

        Consumer<Integer> c1 = n -> System.out.println(n);
        List<Integer> list = List.of(1,2,3,4);
        list.forEach(c1);

        Consumer<List<Integer>> c2 = n-> {
          for(Integer i: n){
              System.out.println(i);
          }
        };
        c2.accept(list);


    }

}

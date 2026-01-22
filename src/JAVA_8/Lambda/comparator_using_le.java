package JAVA_8.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comparator_using_le {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(99);
        list.add(50);
        list.add(23);
        list.add(19);

        Collections.sort(list, (a,b) -> b - a);

        System.out.println(list);

    }
}

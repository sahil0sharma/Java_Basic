package JAVA_8.Lambda;

import java.text.RuleBasedCollator;

public class Thread_using_lb {
    public static void main(String[] args) {

//        Thread t1 = new Thread(() -> {
//            for(int i = 0; i < 1000; i++){
//                System.out.println("hello");
//            }
//        });
//        t1.start();

        Runnable r = () -> {
            for(int i = 0; i < 1000; i++){
                System.out.println("hello");
            }
        };
        Thread task = new Thread(r);
        task.start();


    }
}

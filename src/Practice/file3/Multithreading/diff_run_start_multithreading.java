package Practice.file3.Multithreading;

class MyThread2 extends Thread {
    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}

public class diff_run_start_multithreading  {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2();

        // Case 1: run() directly
        System.out.println("Calling run() directly:");
        t1.run();   // normal method call

        // Case 2: start()
        System.out.println("\nCalling start():");
        t1.start(); // new thread
    }
}
// --> i dont uderstand some of things in progrsm from chgpt to understand
//Calling run() directly:
//main - 1
//main - 2
//main - 3
//
//Calling start():
//Thread-0 - 1
//Thread-0 - 2
//Thread-0 - 3

//
//package file4;
//
//class MyThread2 extends Thread {
//    public void run() {
//        for(int i = 1; i <= 3; i++) {
//            System.out.println(Thread.currentThread().getName() + " - " + i);
//        }
//    }
//}
//class MyThread3 extends Thread {
//    public void run() {
//        for(int i = 1; i <= 3; i++) {
//            System.out.println(Thread.currentThread().getName() + " - " + i);
//        }
//    }
//}
//
//public class diff_run_start_multithreading  {
//    public static void main(String[] args) {
//        MyThread2 t1 = new MyThread2();
//        MyThread3 t2 = new MyThread3();
//
//        // Case 1: run() directly
//        System.out.println("Calling run() directly:");
//        t1.run();   // normal method call
//
//        // Case 2: start()
//        System.out.println("\nCalling start():");
//        t1.start(); // new thread
//
//        // Case 1: run() directly
//        System.out.println("Calling run() directly:");
//        t2.run();   // normal method call
//
//        // Case 2: start()
//        System.out.println("\nCalling start():");
//        t2.start(); // new thread
//    }
//}
//// --> i dont uderstand some of things in progrsm from chatgpt to understand
//Calling run() directly:
//main - 1
//main - 2
//main - 3
//
//Calling start():
//Calling run() directly:
//main - 1
//Thread-0 - 1
//Thread-0 - 2
//Thread-0 - 3
//main - 2
//main - 3
//
//Calling start():
//Thread-1 - 1
//Thread-1 - 2
//Thread-1 - 3
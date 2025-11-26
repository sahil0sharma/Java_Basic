//How do you get state of a given thread in Java

package Practice.file3.Multithreading;
//1 Thread is in NEW
//2 Thread is in RUNNABLE
//3 Name of thread sahilis in RUNNABLE
//4 Thread is in TIMED_WAITING
//5 Thread is in  TERMINATED

class my_thread extends Thread{
    public my_thread(String name){
        super(name);
    }

    public void run(){
        System.out.println("3 Name of thread " + getName() + "is in " + getState());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class problem_gettsate {
    public static void main(String[] args) throws InterruptedException {
        my_thread t = new my_thread("sahil");

        System.out.println("1 Thread is in " + t.getState());
        t.start();

        System.out.println("2 Thread is in " + t.getState());
        t.sleep(100);

        System.out.println("4 Thread is in " + t.getState());
        t.join();

        System.out.println("5 Thread is in  " + t.getState());
    }
}

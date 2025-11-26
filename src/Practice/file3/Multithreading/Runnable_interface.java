package Practice.file3.Multithreading;
class my_Thread1 implements Runnable{
    public void run(){
        System.out.println("run");
    }
}
public class Runnable_interface{
    public static void main(String[] args) {
        my_Thread1 r = new my_Thread1();
        Thread t = new Thread(r);

        t.start();
    }



}


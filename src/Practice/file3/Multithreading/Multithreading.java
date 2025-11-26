package Practice.file3.Multithreading;

class mythread extends Thread {
    public void run(){
        for(int i = 0; i<4000; i++){
            System.out.println("running");
        }
    }
}

class mythread1 extends Thread {
    public void run(){
        for(int i = 0; i<4000; i++){
            System.out.println("walking");
        }
    }
}
public class Multithreading {
    public static void main(String[] args) {
        mythread m = new mythread();
        mythread1 m1 = new mythread1();

        m.start();
        m1.start();
    }
}

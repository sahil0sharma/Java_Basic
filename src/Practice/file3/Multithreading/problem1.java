//Write a program to print "good morning and welcome
//Continuously on the screen in Java using Threads.

package Practice.file3.Multithreading;
class mythreadd1 extends Thread{

    public void run(){
        int i = 0;
        while (i<400){
            System.out.println(" good morning");
            i++;
        }
    }
}

class mythreadd11 extends Thread{

    public void run(){
        int i = 0;
        while (i<400){
            System.out.println("welcome");
            i++;
        }
    }
}
public class problem1 {
    public static void main(String[] args) {
        mythreadd1 t = new mythreadd1();
        mythreadd11 t1 = new mythreadd11();

        t.start();
        t1.start();
    }

}

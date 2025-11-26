//Add a steep method in welcome thread of
// question
// 1 to delay its
//execution for 200 ms.
package Practice.file3.Multithreading;

class mythreadd12 extends Thread{

    public void run(){
        int i = 0;
        while (i<400){
            System.out.println(" good morning");
            i++;

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {       // dont know how to actually use try catch
                throw new RuntimeException(e);       // throw lets see
            }
        }
    }
}

class mythreadd112 extends Thread{

    public void run(){
        int i = 0;
        while (i<400){
            System.out.println("welcome");
            i++;
        }
    }
}
public class problem2 {
    public static void main(String[] args) {
        mythreadd12 t = new mythreadd12();
        mythreadd112 t1 = new mythreadd112();

        t.start();
        t1.start();
    }

}

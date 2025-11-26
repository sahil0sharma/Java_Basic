package Practice.file3.Multithreading;

class mythr extends Thread{
    public mythr(String name){
        super(name);
    }
    public void run(){
        int a = 34;
        for (int i = 0; i<400; i++){
            System.out.println("thread name is " + getName());
            System.out.println("the thread id is " + threadId());
        }
    }
}
public class constructor_from_thread {
    public static void main(String[] args) {

        mythr m = new mythr("sahil");
        m.start();

    }
}


//package file4;
//import java.util.Scanner;
//class mythr extends Thread{
//    int count;
//    public mythr(String name , int count ){
//        super(name);
//        this.count = count;
////        System.out.println(name);
//    }
//    public void run(){
//        for (int i = 0; i<count; i++){
//            System.out.println("thread s running " + getName());
//        }
//    }
//}
//public class constructor_from_thread {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("enter the no. of threads");
//        int n = sc.nextInt();
//
//        for(int i = 0; i<n; i++){
//            System.out.println("enter thread name");
//            String  a = sc.next();
//
//            System.out.print("Enter repeat count for " + a + ": ");
//            int c = sc.nextInt();
//
//            mythr m = new mythr(a,c);
//            System.out.println("Created Thread = "+ m.getName());
//            m.start();
//        }
//    }
//}

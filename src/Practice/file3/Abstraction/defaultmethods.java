//package file2;
//interface feature1 {
//    void camera();
//    void charge();
//    default void dispaly(){
//        System.out.println("output");   // want to update or add a method but cant so default method
//    }                                  // so use default method in inheritence class directly
//}
//
//interface feature2 {
//    void record();
//    void fastcharge();
//}
//class phone implements feature1, feature2
//{
//
//    public void camera(){
//        System.out.println("picture");
//    }
//    public void charge(){
//        System.out.println("charging");
//    }
//
//    public void record(){
//        System.out.println("recoriding");
//    }
//    public void fastcharge(){
//        System.out.println("fast charging");
//    }
//}
//public class defaultmethods {
//    public static void main (String[] args){
//        phone P = new phone();
//
//        P.dispaly();
//
//    }
//}

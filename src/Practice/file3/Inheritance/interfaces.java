//package file2;
//interface A {
//    void m1();   // public abstract by default
//}
//
//interface B {
//    void m2();   // public abstract by default
//}
//
//// ✅ Multiple inheritance by implementing both interfaces
//class C implements A, B {
//    public void m1() {
//        System.out.println("A → m1");
//    }
//
//    public void m2() {
//        System.out.println("B → m2");
//    }
//}
//
//public class interfaces {
//    public static void main(String[] args) {
//        C obj = new C();   // class C ka object
//
//        obj.m1();   // calls m1() from A
//        obj.m2();   // calls m2() from B
//
//        // Agar reference interface type ka banayenge:
//        A aRef = new C();
//        aRef.m1();  //  allowed
//        // aRef.m2(); not allowed (kyunki A me m2() nahi hai)
//
//        B bRef = new C();
//        bRef.m2();  // allowed
//    }
//}

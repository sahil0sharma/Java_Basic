package JAVA_8.Default_and_static_method_in_inheritance;

interface AA{
    static void Hell0(){
        System.out.println("Static hello");
    }
}
public class static_methods implements AA {
    public static void main(String[] args) {
        AA.Hell0();
    }
    static void Hell0(){
        System.out.println("New static method");  //Static method cannot be overridden so every new static is different
    }
}

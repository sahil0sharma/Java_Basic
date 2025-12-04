package Inheritance;

//Grandparent → Parent → Child
class A {
    int x = 10;
    void showA() {
        System.out.println("A method");
    }
}

class B extends A {
    int y = 20;
    void showB() {
        System.out.println("B method");
    }
}

class C extends B {
    int z = 30;
    void showC() {
        System.out.println("C method");
    }
}

public class Multilevel_inheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.showA(); // inherited from A
        obj.showB(); // inherited from B
        obj.showC(); // from C itself
        System.out.println(obj.x + " " + obj.y + " " + obj.z);
    }
}

//A method
//B method
//C method
//10 20 30
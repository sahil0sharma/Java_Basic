package Practice.file3;
//Create an abstract class Pen with methods
//Write () and refill() as abstract methods

abstract class pen {
    abstract void write();
    abstract void refill();
}

class function extends pen{
    void write(){
        System.out.println("writine");
    }
    void refill(){
        System.out.println("refill");
    }
}

public class Problemset11 {
    public static void main(String[] args){
        pen p = new function();
        p.write();
        p.refill();
    }
}

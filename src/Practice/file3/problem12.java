package Practice.file3;
//Use the Pen Class from Q1 to create a
//Concrete class Fountain Pen with additional
//method change Nib()
abstract class pen1 {
    abstract void write();
    abstract void refill();
    abstract void fountain();
}


class function1 extends pen1{
    void write(){
        System.out.println("writine");
    }
    void refill(){
        System.out.println("refill");
    }
    void fountain(){
        System.out.println("change nib");
    }
}

public class problem12 {

    public static void main(String[] args){
        pen1 p = new function1();
        p.write();
        p.refill();
        p.fountain();
    }
}

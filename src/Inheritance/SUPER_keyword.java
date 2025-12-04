package Inheritance;


class vehicle{
    String color;
    int model;

    vehicle(){
        System.out.println("default "+color +" " + model );   // dont have to write unless want to call default

    }

    vehicle(String c, int m){
        this.color = c;
        this.model = m;
        System.out.println("P parameterized "+ color +" " + model );
    }

}

class car extends vehicle{

    car(String c, int m){
        super("prince", 2026);  // You must write super(...) if you want to call a parameterized constructor of the parent.
        this.color = c;       // With no super(...) written: Java inserts super() It calls vehicle() (default constructor)
        this.model = m;         // parent default and child class constructor
        System.out.println("C parameterized "+ color +" " + model );
    }

}
public class SUPER_keyword {
    public static void main(String[] args) {

        car c = new car("red", 2017);

    }
}
//default null 0
//C parameterized red 2017 --> without super

//P parameterized prince 2026
//C parameterized red 2017 ---- with super that help to match the parameterized constructor of parent class

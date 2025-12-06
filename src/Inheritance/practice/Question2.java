package Inheritance.practice;
//Base class Vehicle:
//
//protected: brand (String)
//
//protected: year (int)
//
//Constructor must be parameterized.
//Method display() prints brand and year.
//
//Derived class Car:
//
//model (String)
//
//price (int)
//
//Override display() and call super.display() first.



class vehicle{
    protected String brand;
    protected int year;

    vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    public void display(){
        System.out.println("Name "+ brand + " year " + year);
    }
}
class car extends vehicle{
    protected String model;
    protected int price;

    car(String vehbrand, int vehyear, String model, int price){
        super(vehbrand, vehyear);
        this.model = model;
        this.price = price;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("model " + model + " price " + price);
    }
}
public class Question2 {
    public static void main(String[] args) {
        car c = new car("BMW",2025, "suv", 10);
        c.display();

    }
}

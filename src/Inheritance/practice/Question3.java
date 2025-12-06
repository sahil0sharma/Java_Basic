package Inheritance.practice;
//Base class Product:
//
//private: price (int)
//
//name (String)
//
//Constructor sets both.
//Provide a protected getPrice() method.
//
//Derived class Electronic:
//
//warranty (int)
//
//Override showDetails()
//Call getPrice() from child (indirect access to private field).

class product{
    private int price;
    String name;

    product(int price, String name){
        this.price = price;
        this.name = name;
    }
    protected int getprice(){
        return price;
    }
    public void showdetails(){
        System.out.println(name);
        System.out.println(price);
    }
}
class electronic extends product{
    private int warranty;

    electronic(int proprice,String proname, int warranty){
        super(proprice,proname);
        this.warranty = warranty;
    }
    @Override
    public void showdetails(){
        System.out.println(name);
        System.out.println(getprice());
        System.out.println("warranty " + warranty);
    }
}
public class Question3 {
    public static void main(String[] args) {
        electronic e = new electronic(200,"mixer", 4);
        e.showdetails();
    }
}

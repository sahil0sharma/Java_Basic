package Inheritance.practice;
//Base class Company:
//
//companyName (String)
//
//Constructors:
//
//default: prints "Default company"
//
//parameterized: sets companyName
//
//Derived class Manager:
//
//managerName (String)
//
//Write two constructors:
//
//default: automatically calls super()
//
//parameterized: must call super(companyName)
//
//Override display()

class company{
    String name;

    company(){
        System.out.println("Default company");
    }
    company(String name){
        this.name = name;
    }

    void display(){
        System.out.println("company name "+name);
    }
}
class manager extends company{
    String managername;

    manager(){
        super();
    }
    manager(String name, String managername){
        super(name);
        this.managername = managername;
    }
    void display(){
        super.display();
        System.out.println("manager name "+ managername);
    }
}


public class Question4 {
    public static void main(String[] args) {
        manager m = new manager();
        manager m1 = new manager("sahil","prince");
        m1.display();

    }
}

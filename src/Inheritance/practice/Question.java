package Inheritance.practice;
//Hierarchy:
//
//Employee → Engineer → SeniorEngineer
//Employee:
//
//name, id
//
//display()
//
//Engineer:
//
//specialization
//
//override display()
//
//SeniorEngineer:
//
//experience (int)
//
//override display()
//
//Constructor of each must call super(...) correctly.
//Finally:
//
//SeniorEngineer se = new SeniorEngineer("Raju", 101, "Java", 5);
//se.display();
//You must understand multilevel constructor execution order.

class Employee {
    String name;
    int id;

    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    void display(){
        System.out.println(name);
        System.out.println(id);
    }
}
class Engineer extends Employee{
    String specialization;

    Engineer(String name,int id, String spec){
        super(name,id);
        this.specialization = spec;
    }

    void display(){
        super.display();
        System.out.println(specialization);
    }
}
class seinorengineer extends Engineer{
    int experince;

    seinorengineer(String name, int id, String spec,int experince){
        super(name,id,spec);
        this.experince = experince;
    }

    void display(){
        super.display();
        System.out.println(experince);
    }
}
public class Question {
    public static void main(String[] args) {
       seinorengineer se = new seinorengineer("Raju", 101, "Java", 5);
       se.display();

    }
}

package Inheritance.practice;
//Base class Animal:
//
//private age (int)
//
//parameterized constructor sets age
//
//protected getAge() returns age
//
//Derived class Dog:
//
//name (String)
//
//Constructor must call super(age)
//
//Override display() – must use getAge() to print age
//
//This forces you to use private fields correctly with inheritance.

class Animal{
    private int age;

    Animal(int age){
        this.age = age;
    }
    protected int getage() {
        return age;
    }

    public void display(){
        System.out.println(age);
    }
}
class dog extends Animal{
    String name;

    dog(int age, String name){
        super(age);
        this.name = name;
    }

    @Override
    public void display(){
        super.display();
        System.out.println(name);
    }

}
public class Question7 {
    public static void main(String[] args) {

        dog d = new dog(19,"prince");
        d.display();
    }
}

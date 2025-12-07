package Inheritance.practice;
//Base class School:
//
//name (String)
//
//id (int)
//
//show() method prints base fields
//
//Derived class Student:
//
//specialization (String)
//
//Override show()
//
//Ask:
//
//Which method runs at runtime?
//
//Which methods are visible at compile-time

class school{
    String name;
    int id;

    school(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void show(){
        System.out.println(name);
        System.out.println(id);
    }
}
class student extends school{
    String specialization;

    student(String name, int id, String spec){
        super(name,id);
        this.specialization = spec;
    }

    @Override
    public void show(){
        super.show();
        System.out.println(specialization);
    }
}
public class Question6 {
    public static void main(String[] args) {

        student s = new student("st mary", 4, "teacher");
        s.show();

    }
}

package JAVA_8.Functions;

import java.util.function.Function;

class student{
    String name;
    int age;

    student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class using_object {
    public static void main(String[] args) {

        Function<student, String> function1 = s -> s.name;

        student s = new student("sahil", 19);
        System.out.println(function1.apply(s));
    }
}

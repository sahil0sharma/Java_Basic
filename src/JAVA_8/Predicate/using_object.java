package JAVA_8.Predicate;

import java.util.function.Predicate;

class Student{
    int marks;

    Student(int marks){
        this.marks = marks;
    }
}
public class using_object {
    public static void main(String[] args) {

        Predicate<Student> isTrue = (n) -> n.marks >= 40;
        Student s1 = new Student(23);
        System.out.println(isTrue.test(s1));
    }
}

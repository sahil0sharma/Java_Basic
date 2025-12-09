package Static;

class Student{

    String name;
    int age;

    public static int count;

    Student(){

        count++;
    }
}
public class static_member_and_method {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student(); System.out.println(s2.count); // 2
        Student s3 = new Student();
        Student s4 = new Student();


        System.out.println(Student.count); // access via directly class -> 4

        static_member_and_method.display();


    }

    public static void display(){
        int count = Student.count; // made a local variable that will access diff class static member
        System.out.println(count); // 4
    }
}

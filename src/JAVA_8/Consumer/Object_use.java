package JAVA_8.Consumer;

import java.util.function.Consumer;

class student{
    String name;

    student(String name){
        this.name = name;
    }
}
public class Object_use {
    public static void main(String[] args) {

        Consumer<student> c1 = n -> System.out.println(n.name);

        c1.accept(new student("sahil"));
    }
}

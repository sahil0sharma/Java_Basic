package Constructor;

import java.security.PrivateKey;

public class Constructor {
    private String name;
    private int age;

    Constructor (String n, int a){
        this.name = n;
        this.age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Constructor c = new Constructor("sahil" , 19);
        System.out.println(c.getName() + " " + c.getAge());


    }
}

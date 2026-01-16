package Practice_new.part1;

public class thisss {

    private int age;

    public void setAge(int age, thisss obj){
        thisss obj1 = obj;
        obj1.age = age;
    }

    public static void main(String[] args) {
        thisss s = new thisss();
        s.setAge(12, s);
        System.out.println(s.age);


    }
}

package Practice.file3;
//Create a class Monkey with jump () and bite()
//methods. Create a class Human which inherits
//this Monkey class and implements Basic Animal
//interface with eat () and sleep() methods.
class monkey{
    void jump(){
        System.out.println("jumping");
    }
    void bite(){
        System.out.println("biting");
    }
}

interface animal{
    void eat(); 
    void sleep();
}
class human extends monkey implements animal{
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }

}
public class problem13 {
    public static void main(String[] args){
        animal h = new human();
        h.eat();
       // h.jump();
        h.sleep();
        //h.bite();
    }

}

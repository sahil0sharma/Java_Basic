package Practice.file3.Inheritance;

//animal ref = sab methods access jo animal ne implement + inherit kiya.
//dog ref = sirf dog class ke methods access.
//interface ref = sirf us interface ke methods access.

interface sound{
        void bark();
        void grugle();
}
interface moment{
    void walk();
    void running();
}
class dog{
    void dogcolor(){
        System.out.println("brown dog");
    }
    void legs(int x){
        System.out.println(x +" " + "legs" );
    }
}
class animal extends dog implements sound,moment{
    public void bark (){
        System.out.println("bhau bahu bahuuu");
    }
    public void grugle(){
        System.out.println("grrr grrr...");
    }
    public void walk(){
        System.out.println("walk");
    }
    public void running(){
        System.out.println("run");
    }
}
public class Runtimepolymorphism {
    public static void main(String[] args){

        animal a = new animal();
//
//        bhau bahu bahuuu
//        grrr grrr...
//        walk
//        run
//        4 legs
//        brown dog


        // making animal class as reference and using all methiods that are impplemented in animal class
        a.bark();
        a.grugle();  //--> sound

        a.walk();
        a.running(); //--> momnet

        a.legs(4);
        a.dogcolor(); //--> dog class

        // making animal class as reference variable and using only dog mehotds by creating its objects

        dog d = new animal();
        d.dogcolor();
        d.legs(4);  //--> can only access dog class method

        // making interface refrence and creating animal object but only allowing interface method

        sound s = new animal();
        s.bark();
        s.grugle();

        moment m = new animal();
        m.walk();
        m.running();

    }
}

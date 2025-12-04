package Inheritance;

class president{
    String name;
    int year;

    president(String n, int y){
        this.name = n;
        this.year = y;
    }

    void detailPresident(){
        System.out.println(" president name : " +name);
        System.out.println(" P Year : " + year);
    }
}
class VP extends president{

    VP(String n, int y){
        super(n,y);                //super keyword is used when to call parent class constructor and methods
        super.detailPresident();                // using super to call method of parent class
        System.out.println("vice president ");
    }

}

public class Single_inheritance {
    public static void main(String[] args) {
        VP p = new VP("sahil", 2025);

    }
}

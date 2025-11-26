package Practice.file3.Inheritance;
interface color{
    void red();
    void green();
}
interface rgb extends color{
    void breathing();
    void Static();
}
class mouse implements color,rgb{
    public void red(){
        System.out.println("red");
    }
    public void green (){
        System.out.println("green ");
    }
    public void breathing(){
        System.out.println("breath");
    }
    public void Static(){
        System.out.println("static");
    }
}
public class inheritenceWITHinterfece {
    public static void main(String[] args){
        mouse m = new mouse();

        m.red();

    }
}

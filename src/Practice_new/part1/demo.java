package Practice_new.part1;
class comp{

    public void show1(){
        System.out.println("in show A");
    }
}
class lap extends comp{
    public void show2(){
        System.out.println("in show B");
    }
}
public class demo {
    public static void main(String[] args) {
        comp a = (comp) new lap();
        a.show1();

        lap a1 = (lap) a;
        a1.show2();


        int[] arr = {1,2,3,4};
        System.out.println(arr.length);
    }
}

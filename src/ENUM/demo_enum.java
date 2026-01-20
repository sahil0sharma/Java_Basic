package ENUM;


enum Status{

    Running , Failed ,Pending, Success;
}
public class demo_enum {
    public static void main(String[] args) {

        Status[] s = Status.values();
        for(Status i : s){
            System.out.println(i + " : " + i.ordinal());
        }

    }
}

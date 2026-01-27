package Exception;

class New extends Exception{

    New(String msg){
        super(msg);
    }
}
public class Custom_exception {

    static void NEWage(int a) throws New {
        if (a < 18) {
            throw new New("custom Exception Message : age cannot be below than 18");
        }
        System.out.println("Eligible age");
    }
    public static void main(String[] args){

        try{
            Custom_exception.NEWage(12);
        } catch (New e) {
            System.out.println(e.getMessage());
        }

        // OR declare Exception in Method to declare it just
    }
}

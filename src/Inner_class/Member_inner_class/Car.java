package Inner_class.Member_inner_class;

public class Car {

    boolean engineOn;
    String name;

    public Car(String n){
        this.engineOn = false;
        this.name = n;
    }

    class engine {

        void start(){
            if(!engineOn){
                engineOn = true;
                System.out.println("Engine is On");
            } else {
                System.out.println("Engine is alredy on");
            }
        }

        void stop(){
            if(engineOn){
                engineOn = false;
                System.out.println("Engine Stopped");
            } else {
                System.out.println("Engine alredy stopped");
            }
        }
    }
}

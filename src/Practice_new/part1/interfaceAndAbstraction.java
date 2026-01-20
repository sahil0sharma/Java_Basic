package Practice_new.part1;


interface Machine{
    public  String start();
}

abstract class appliance implements Machine {

            String name;

            appliance(String name){
                this.name = name;
            }
}
class Fan implements Machine {


    public Fan(String fan) {
    }

    public String start(){
        return  "Fan is running";
    }
}

class WashingMachine implements Machine {


    public WashingMachine(String washingMachine) {
    }

    @Override
    public String start() {
        return "Washing Machine is operating";
    }
}

public class interfaceAndAbstraction {
    public static void main(String[] args) {
        Machine fan = new Fan("Fan");
        Machine washer = new WashingMachine("Washing Machine");
        System.out.println(fan.start());
        System.out.println(washer.start());

    }
}

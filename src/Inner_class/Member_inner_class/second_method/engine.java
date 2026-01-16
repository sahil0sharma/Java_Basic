package Inner_class.Member_inner_class.second_method;

public class engine {

    private Car2 car;

    public engine(Car2 car){
        this.car = car;
    }

    void start(){
        if(!car.isEngine()){
            car.setEngine(true);
            System.out.println("engine start");
        } else {
            System.out.println("alredy started");
        }
    }
    void stop(){
        if(car.isEngine()){
            car.setEngine(false);
            System.out.println("engine stopped");
        } else {
            System.out.println("engine alredy stopped");
        }
    }
}

package Inner_class.Member_inner_class.second_method;

public class Car2 {

    private boolean issengine;
    private String model;

    Car2(String m){
        this.issengine = false;
        this.model = m;
    }

    public String getModel() {
        return model;
    }

    public boolean isEngine() {
        return issengine;
    }

    public void setEngine(boolean engine) {
        this.issengine = engine;
    }
}


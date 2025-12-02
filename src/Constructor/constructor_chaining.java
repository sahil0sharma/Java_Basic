package Constructor;

public class constructor_chaining{

    String name;
    int age;
    float height;

    constructor_chaining(){
        this("sahil");                  // In this using This keyword is mandatory and also chain them using this
    }                                      // constructor calling constructor = constructor chaining = same

    constructor_chaining(String s){
        this(s, 19);
    }

    constructor_chaining (String s, int a){
        this(s, a, 5.10f);
    }

    constructor_chaining (String s, int a, float h){
        this.name = s;
        this.age = a;
        this.height = h;
    }

    public static void main(String[] args) {
        constructor_chaining c = new constructor_chaining("sahil", 19);
        System.out.println(c.name+ " " + c.age);


    }
}


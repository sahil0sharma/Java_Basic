package Constructor;

public class constructor_overloading {

    String name;
    int age;
    float height;

    constructor_overloading (){
        this("sahil");        // constructor overloading is when there are diff parameter with same constructor
    }                            // using this keyword means chaining also known as (constructor calling another constructor)
                                 // IN overloading also this keyword can use but it is solely for chaining also
    constructor_overloading(String s){
        this(s, 19);
    }

    constructor_overloading (String s, int a){
        this(s, a, 5.10f);
    }

    constructor_overloading (String s, int a, float h){
        this.name = s;
        this.age = a;
        this.height = h;
    }

    public static void main(String[] args) {
        constructor_overloading c = new constructor_overloading("sahil", 19);
        System.out.println(c.name+ " " + c.age);


    }
}

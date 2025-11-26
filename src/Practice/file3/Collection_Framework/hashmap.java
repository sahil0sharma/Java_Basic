package Practice.file3.Collection_Framework;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
//        HashMap<person, String> h = new HashMap<>();
//        person p1 = new person("sahil", 19);
//        person p2 = new person("rohit", 20);
//        person p3 = new person("sahil", 21); // because of "new" same name will
//                                                   // have diffrent index and hashcode
//        h.put(p1, "IT"); // hashcode1 --> index2
//        h.put(p2, "CS"); // hashcode2 --> index5
//        h.put(p3, "AI"); // hashcode3 --> index4
                                                    /// checks 19 == 21
//          System.out. println( "one " + h.get(p1));
//          System.out. println( "two " + h.get(p3));  // output-->  one IT  --> one and two are diffrent
//                                                     //            two AI

//        //  System.out.println(p1);   //this is tostring  // output--> age: 19, name: sahil

//--------------------------------------------------------------------------------------------------------------------//
                //----------------this is the code that explain by lecture---------------//
//--------------------------------------------------------------------------------------------------------------------//
        HashMap<person, String> h1 = new HashMap<>();
        person p4 = new person("sahil", 19);
        person p5 = new person("rohit", 20);
        person p6 = new person("sahil", 19); // because of "new" same name will
                                                   // have diffrent index and hashcode

                                                 /// because it checks 19 == 19
        h1.put(p4, "IT"); // hashcode1 --> index2
        h1.put(p5, "CS"); // hashcode2 --> index5
        h1.put(p6, "AI"); // hashcode3 --> index4

        System.out.println(h1.get(p4));
        System.out.println(h1.get(p5));
        System.out.println(h1.get(p6));
        //  System.out.println(p1);   //this is tostring  // output--> age: 19, name: sahil

        /// this is the output of code that i dont understand
//        System.out. println( "one " + h1.get(p4));  // checks 19 == 21
//        System.out. println( "two " + h1.get(p6));  // output-->  one AI --> one and two are same
//        //             two AI


//        HashMap<String, Integer> h4 = new HashMap<>(); // new hashmap for better analogy
//        h1.put("sahil", 1);
//        h1.put("rohit", 2);     // In this case ↓
//        h1.put("sahil", 3);    // hashcode--> index--> equals()--> replace

    }




}

class person{
    String name;
    int age;

    person(String n, int a){
        this.name = n;
        this.age = a;

    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

//    @Override                               //------------------------------------------------------------------------//
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }
//
//    @Override
//    public boolean equals(Object obj) {                                            // i dont understand this part
//            if(this == obj){
//            return true;
//        }
//        if(obj == null){
//            return false;
//        }
//        if(getClass() != obj.getClass()){
//            return false;
//        }
//        person other = (person) obj;
//        return age == other.getAge() && Objects.equals(name, other.getName()); //-------------------------------------//
//    }

    @Override
    public String toString() {
        return "age: " + age + ", " +  "name: "  + name;
    }
}

package Static;


// singleton pattern :-
//A Singleton pattern is a design pattern that ensures:
//
//Only one object of a class can ever be created.
//
//Everyone uses the same shared instance.
// In this code we are making sure that anyone can only make one instance of this class

public class class_object_instatnce {

    private static class_object_instatnce sc = new class_object_instatnce(); // creating object with in class
//                                         ^                                              ^
//                                         |                                              |-> this object is instance variable
//                                         |-> reference variable that is storing instance variable
    private class_object_instatnce(){

    }

    public static class_object_instatnce instance(){
        return sc;
    }
}
//A proper Singleton class must:
//
//Make constructor private → nobody outside can use new.
//
//Create a single static instance inside the class.
//
//Provide a public static method to return that instance.
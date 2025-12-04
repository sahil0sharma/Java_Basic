package Inheritance;

// Multiple child class extends single Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("This dog barks.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("This cat meows.");
    }
}

public class Hierarchial_inheritance  {
    public static void main(String[] args) {
        Dog dog = new Dog();
        // Call the eat method inherited from the Animal class using the Dog object
        dog.eat(); // Output: This animal eats food.
        // Call the bark method specific to the Dog class
        dog.bark(); // Output: This dog barks.

        Cat cat = new Cat();
        // Call the eat method inherited from the Animal class using the Cat object
        cat.eat(); // Output: This animal eats food.
        // Call the meow method specific to the Cat class
        cat.meow(); // Output: This cat meows.
    }
}


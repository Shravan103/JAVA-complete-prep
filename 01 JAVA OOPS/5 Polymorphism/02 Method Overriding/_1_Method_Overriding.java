// 📍 Method Overriding
// →  Method Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is 
//    already provided by one of its super-classes or parent classes. When a method in a subclass has the same name, same parameters 
//    or signature, and same return type as a method in its super-class, then the method in the subclass is said to override the method 
//    in the super-class.
// →  If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
// →  Method Overriding is used for runtime polymorphism.

// 📍 Rules for Method Overriding:
// 1.  The method must have the same name as in the parent class
// 2.  The method must have the same parameter as in the parent class.
// 3.  There must be an IS-A relationship (inheritance).

// ChatGPT Code:
// Parent class
class Animal {
    // Method to be overridden
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    // Overriding the method from Animal class
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
    void mm() {
        System.out.println("mm");
    }
}

public class _1_Method_Overriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Parent class object   
        myAnimal.makeSound(); // Calls the parent class method

        Dog myDog = new Dog(); // Child class object
        myDog.makeSound(); // Calls the overridden method in Dog class
        myDog.mm();

        System.out.println("---------------------------");

        Animal myDog2 = new Dog(); // Upcasting: Parent class reference to Child class object
        myDog2.makeSound(); // Calls the overridden method in Dog class
        // myDog2.mm(); // Compilation error: The method mm() is undefined for the type Animal

        // Dog myAnimal2 = new Animal(); // Compilation error: Cannot convert from Animal to Dog
        // myAnimal2.makeSound();
    }
}

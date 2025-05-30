// 📍1. Single Inheritance
// When a class inherits another class, it is known as a single inheritance.
// In the example below, Dog class inherits the Animal class, so there is the single inheritance.

// Superclass: Animal class
class Animal {
    void eat() {
        System.out.println("eating...");
    }
}
//Subclass: Dog class inherits the Animal class
class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

public class _2_Single_Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark(); // Dog class method
        d.eat();  // Animal class method
    }
}

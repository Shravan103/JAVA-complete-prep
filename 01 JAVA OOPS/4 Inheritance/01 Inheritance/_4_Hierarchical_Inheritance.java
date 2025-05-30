// 📍3. Hierarchical Inheritance
// When two or more class inherits a single class, it is known as hierarchical Inheritance.
// In the example below, Dog and Cat class inherits the Animal class, so there is a hierarchical inheritance.

// Superclass: Animal class
class Animal
{
    void eat()
    {
        System.out.println("eating...");
    }
}
//Subclass: Dog class inherits the Animal class
class Dog extends Animal
{
    void bark()
    {
        System.out.println("barking...");
    }
}
//Subclass: Cat class inherits the Animal class
class Cat extends Animal
{
    void meow()
    {
        System.out.println("meowing...");
    }
}
public class _4_Hierarchical_Inheritance {
    public static void main(String[] args) {
        // Creating objects of Cat
        Cat c = new Cat();
        c.meow(); // Cat class method
        c.eat();  // Animal class method
        // c.bark(); // Error: Cannot find symbol

        // Creating objects of Dog
        Dog d = new Dog();
        d.bark(); // Dog class method
        d.eat();  // Animal class method
        // d.meow(); // Error: Cannot find symbol
    }
}

// Output:
// meowing...
// eating...
// barking...
// eating...

// 🚀 Now Goto _1_Inheritance.java to see Questions on Inheritance.
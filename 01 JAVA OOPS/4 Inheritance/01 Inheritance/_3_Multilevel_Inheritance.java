// 📍2. Multilevel Inheritance
// When there is a chain of inheritance, it is known as multilevel inheritance.
// In the example below, BabyDog class inherits the Dog class which inherits the Animal class, so there is a multilevel inheritance.

// Superclass: Animal class
class Animal{
    void eat(){
        System.out.println("eating...");
    }
}
//Subclass: Dog class inherits the Animal class
class Dog extends Animal{
    void bark(){
        System.out.println("barking...");
    }
}
//Subclass: BabyDog class inherits the Dog class
class BabyDog extends Dog{
    void weep(){
        System.out.println("weeping...");
    }
}
public class _3_Multilevel_Inheritance {
    public static void main(String[] args) {
        BabyDog d = new BabyDog();
        d.weep(); // BabyDog class method
        d.bark(); // Dog class method
        d.eat();  // Animal class method
    }

}

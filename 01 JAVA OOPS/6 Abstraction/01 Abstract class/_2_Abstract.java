// 📍 Abstract class:
// 1️⃣ RULE: IF THERE IS AN ABSTRACT METHOD IN A CLASS, THAT CLASS MUST BE ABSTRACT.
// EXAMPLE:
// class Bike{
//     abstract void run();
// }
// --> Compilation Error

// 2️⃣ RULE: IF YOU ARE EXTENDING AN ABSTRACT CLASS, YOU MUST EITHER PROVIDE THE IMPLEMENTATION OF 
//          THE ABSTRACT METHOD IN SUBCLASS OR MAKE THIS SUBCLASS CLASS ABSTRACT.

// 📍 Abstract class having constructor, data member and methods:
//  → An abstract class can have a data member, abstract method, non-abstract method, constructor, and even main() method.
// Example:
abstract class Bike{
    Bike(){
        System.out.println("bike is created");
    }
    abstract void run();
    void changeGear(){
        System.out.println("gear changed");
    }
}
class Honda extends Bike{
    @Override
    void run(){
        System.out.println("running safely");
    }
}

// 📍 Another Real scenario of abstract class:
// →  The abstract class can also be used to provide some implementation of the interface.
// →  In such case, the end user may not be forced to override all the methods of the interface.
// Example:
interface A{
    void a();
    void b();
    void c();
    void d();
}
abstract class B implements A{
    @Override
    public void c(){
        System.out.println("I am C");
    }
}
class M extends B{
    @Override
    public void a(){
        System.out.println("I am a");
    }
    @Override
    public void b(){
        System.out.println("I am b");
    }
    @Override
    public void d(){
        System.out.println("I am d");
    }
}

public class _2_Abstract {
    public static void main(String[] args) {
        // 📍 Abstract class having constructor, data member and methods:
        Bike obj = new Honda();
        obj.run();
        obj.changeGear();
        // Output:
        // bike is created
        // running safely
        // gear changed

        // 📍 Another Real scenario of abstract class:
        A a = new M();
        a.a();
        a.b();
        a.c();
        a.d();
        // Output:
        // I am a
        // I am b
        // I am C
        // I am d
    }
}

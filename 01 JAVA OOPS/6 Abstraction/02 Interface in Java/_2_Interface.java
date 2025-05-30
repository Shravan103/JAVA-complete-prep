// 📍 Interface in Java:

//--------------------------------------------------------------------------------------------------------------------------------

// 📍 Relationship between classes and interfaces:
//  →  A class extends another class, an interface extends another interface, but a class implements an interface.
//  →  An interface cannot implement another interface. It only extends.
// Example:
// Q. why use "public" for:
// public void print(){
//     System.out.println("Hello");
// } ?????
// → In an interface, all methods are public by default (even if public is not written explicitly).
// → When a class implements an interface, it must provide an implementation for all abstract methods.
// → Java does not allow reducing the visibility of an overridden method, so the method in A6 must be public.

interface printable{
    void print();
}
class A6 implements printable{
    @Override
    public void print(){
        System.out.println("Hello");
    }
}

//--------------------------------------------------------------------------------------------------------------------------------

// 📍 Java Interface Example: Drawable
// In this example, the Drawable interface has only one method. Its implementation is provided by the Rectangle and Circle classes.
interface Drawable{
    void draw();
}
class Rectangle implements Drawable{
    @Override
    public void draw(){
        System.out.println("drawing rectangle");
    }
}
class Circle implements Drawable{
    @Override
    public void draw(){
        System.out.println("drawing circle");
    }
}

//--------------------------------------------------------------------------------------------------------------------------------

// 📍 Java Interface Example: Bank
interface Bank{
    float rateOfInterest();
}
class SBI implements Bank{
    @Override
    public float rateOfInterest(){
        return 9.15f;
    }
}
class PNB implements Bank{
    @Override
    public float rateOfInterest(){
        return 9.7f;
    }
}

public class _2_Interface {
    public static void main(String[] args) {
        // 📍 Relationship between classes and interfaces:
        A6 obj = new A6();
        obj.print();

        // 📍 Java Interface Example: Drawable
        Drawable d = new Circle();
        d.draw();

        // 📍 Java Interface Example: Bank
        Bank b = new SBI();
        System.out.println("ROI: "+b.rateOfInterest()+"%");
    }
}



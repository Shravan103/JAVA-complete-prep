// 📍 Abstract class:
//  → A class which is declared as abstract is known as an abstract class. 
//  → It can have abstract and non-abstract methods (method with the body).

// What is Abstraction?
// → Abstraction is a process of hiding the implementation details and showing only functionality to the user.
// → Abstraction lets you focus on what the object does instead of how it does it.

// 2 ways to achieve abstraction in java:
// 1. Abstract class (0 to 100%)
// 2. Interface (100%)

// 📍 Abstract class in Java:
//  → It needs to be extended and its method implemented. It cannot be instantiated.
// Points to remember:
// 1. An abstract class must be declared with an abstract keyword.
// 2. It can have abstract and non-abstract methods.
// 3. It cannot be instantiated.
// 4. It can have constructors and static methods also(but not default methods).
// 5. It can have final methods which will force the subclass not to change the body of the method.

// What is an abstract method?
// → A method which is declared as abstract and does not have implementation/body is known as an abstract method.
// → Example: abstract void display();

// 📍 Example of an abstract class:
// → In this example, Bike is an abstract class that contains only one abstract method "run".
// → It's implementation is provided by the Honda class.
abstract class Bike{
    abstract void run();
}
class Honda extends Bike{
    @Override
    void run(){
        System.out.println("running safely");
    }
}

// 📍 Understanding the real scenario of Abstract class
// → In this example, Shape is an abstract class that contains an abstract method "draw".
// → It's implementation is provided by the Rectangle and Circle class.
// → Mostly, we don't know about the implementation class(which is hidden to the end user) 
//   and object of the implementation class is provided by the factory method.
// → The factory method is a method that returns the instance of the class.
abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("drawing rectangle");
    }
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("drawing circle");
    }
}

// 📍 Another example of Abstract class in Java
abstract class Bank{
    abstract int getRateOfInterest();
}
class SBI extends Bank{
    @Override
    int getRateOfInterest(){
        return 7;
    }
}
class PNB extends Bank{
    @Override
    int getRateOfInterest(){
        return 8;
    }
}


public class _1_Abstract{
    public static void main(String[] args){
        // 📍 Example of an abstract class:
        Bike obj = new Honda();
        obj.run();

        // 📍 Understanding the real scenario of Abstract class
        Shape s1 = new Circle();
        s1.draw();

        // 📍 Another example of Abstract class in Java
        Bank b1 = new SBI();
        System.out.println("Rate of Interest is: "+b1.getRateOfInterest()+" %");
        Bank b2 = new PNB();
        System.out.println("Rate of Interest is: "+b2.getRateOfInterest()+" %");
    }
}
// OUTPUT:
// running safely
// drawing circle
// Rate of Interest is: 7 %
// Rate of Interest is: 8 %
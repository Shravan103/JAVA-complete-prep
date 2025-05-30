// 📍Inheritance
// Inheritance is a mechanism in which one class acquires the properties and behaviors of another class.
// Class which is inherited is known as Superclass and the class which inherits is known as Subclass.

// 1. Why use inheritance in java?
// →  For Method Overriding (so runtime polymorphism can be achieved) & Code Reusability.

// Syntax of Java Inheritance:
// class Subclass_name extends Superclass_name
// {
//    //methods and fields
// }

//📍Simple Example:
// Assuming all Employees have same salary, but diiferent bonus for different roles.
class Employee {
    float salary = 40000;
}
class Programmer extends Employee {
    int bonus = 10000;
}
public class _1_Inheritance {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary is: " + p.salary);
        System.out.println("Bonus of Programmer is: " + p.bonus);
    }
}
// Output:
// Programmer salary is: 40000.0
// Bonus of Programmer is: 10000

//📍Types of Inheritance in JAVA:
// 1. Single
// 2. Multilevel
// 3. Hierarchial
// 4. In Java, multiple (One class inherits multiple classes) and hybrid inheritance is supported through Interface only (not through class).

// 🚀 Questions:
// Q1. Why Multiple Inheritance is not supported in Java?
// →   Consider a scenario where A, B, and C are three classes. The C class inherits A and B classes.
//     If A and B classes have the same method and you call it from child class object,
//     there will be ambiguity to call the method of A or B class.
//     Since compile-time errors are better than runtime errors, Java renders compile-time error if you inherit 2 classes.
//     So whether you have the same method or different, there will be ambiguity.

// class A{
//     void msg(){
//         System.out.println("Hello");
//     }
// }
// class B{
//     void msg(){
//         System.out.println("Welcome");
//     }
// }
// class C extends A,B{
//     void display(){
//         msg(); // which msg() to call? A or B?
//     }
// }
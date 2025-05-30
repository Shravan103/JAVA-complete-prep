// 📍Covariant Return type (geeksforgeeks):
// Before JDK 5.0, it was not possible to override a method by changing the return type. When we override a parent class method, 
// the name, argument types, and return type of the overriding method in child class has to be exactly the same as that of the 
// parent class method. The overriding method was said to be invariant with respect to return type. 
// Java version 5.0 onwards it is possible to have different return types for an overriding method in the child class, 
// but the child’s return type should be a subtype of the parent’s return type. The overriding method becomes variant 
// with respect to return type.

// CODE:
// Class 1
class A {
}
 
// Class 2
class B extends A {
}
 
// Class 3
// Helper class (Base class)
class Base {
 
    // Method of this class of class1 return type
    A fun()
    {
        // Display message only
        System.out.println("Base fun()");
 
        return new A();
    }
}
 
// Class 4
// Helper class extending above class
class Derived extends Base {
 
    // Method of this class of class1 return type
    @Override
    B fun()
    {
        // Display message only
        System.out.println("Derived fun()");
 
        return new B();
    }
}
 
// Class 5
// Main class
public class GFG {
 
    // Main driver method
    public static void main(String args[])
    {
 
        // Creating object of class3 type
        Base base = new Base();
 
        // Calling method fun() over this object
        // inside main() method
        base.fun();
 
        // Creating object of class4 type
        Derived derived = new Derived();
 
        // Again calling method fun() over this object
        // inside main() method
        derived.fun();
    }
}

// Output: 
// Base fun()
// Derived fun()
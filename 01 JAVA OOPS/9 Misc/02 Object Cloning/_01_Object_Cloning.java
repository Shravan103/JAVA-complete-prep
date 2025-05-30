// 📍 Object Cloning:
//  This is useful when we need a duplicate object but modifying it should not affect the original object.
//  Way to create exact copy of an object.
//  ● clone() method of Object class is used to clone an object.
//  ● The "java.lang.Cloneable interface" must be implemented by the class whose object clone we want to create.
//  ● If we dont implement Cloneable interface, clone() methode generated "CloneNotSupportedException".
//  ● clone() method defined in --> Object class
//  SYNTAX:
//  protected Object clone() throws CloneNotSupportedException

// 📍 NOTE:
//  If you want to write a clone method in a child class then all of it's superclasses should define the clone() method
//  in them or inherit it from another parent class. Otherwise super.clone() chain will fail.

// 📍 Types of Cloning
// 1️⃣ Shallow Copy (Default clone() Behavior)
//  ●  If you modify the referenced object, the change will be reflected in both the original and cloned objects.
//  ●  If you change the parent/cloned object then the changes will be also reflected in cloned/parent object.
// 2️⃣ Deep Copy (Manually cloning nested objects)

// 📍 Why use clone() method ?
//  The clone() method saves extra processing task for creating the exact copy of an object.
//  If we perform it using new keyword, it will take a lot of processing time to be performed.

// 📍 clone() method calls super.clone(), which creates a shallow copy of the object. 
//  This means:
//  -> Primitive fields (int rollno) are copied directly.
//  -> Reference fields (String name) are copied by reference (i.e., both objects share the same name string).

// Example:
// 1️⃣ Shallow Copy (Default clone() Behavior):

class Student18 implements Cloneable{
    int rollno;
    String name; 
    // String name; -> Immutable, therefore this shallow copy code behaves like deep copy code, Instead use the stringbuilder.
    //              -> See code _03_Object_Cloning.java

    Student18(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class _01_Object_Cloning{
    public static void main(String args[])
    {
        try {
            Student18 s1 = new Student18(101, "amit");
            Student18 s2 = (Student18)s1.clone();

            System.out.println("Before modification:");
            System.out.println("s1: " + s1.rollno + " " + s1.name);
            System.out.println("s2: " + s2.rollno + " " + s2.name);

            // Modify the cloned object's name
            s2.name = "rahul";

            System.out.println("\nAfter modifying s2.name:");
            System.out.println("s1: " + s1.rollno + " " + s1.name);
            System.out.println("s2: " + s2.rollno + " " + s2.name);
        } 
        catch (CloneNotSupportedException c) {
        }
    }
}
// OUTPUT:
// Before modification:
// s1: 101 amit
// s2: 101 amit

// After modifying s2.name:
// s1: 101 amit
// s2: 101 rahul
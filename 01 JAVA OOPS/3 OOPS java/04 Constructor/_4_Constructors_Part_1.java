// 📍 CONSTRUCTOR:
// Block of code similar to method.
// Constructor is called when an instance of class is created.
// Special type of method to initialize an "object".
// Everytime we use new(), atleast one constructor is created (if none then "default constructor" is called).
// 3 types of Constructor: 
// 1) No-arg constructor 
// 2) Parameterized constructor. 
// 3) Copy constructor (not present in java, but we can make it happen)[In PART 2]
// Constructor rules: (a) name must be same as class name. (b) No explicit return type. (c) Constructor function cannot be static, abstract.

// 📍 Constructor Overloading:
// Having more than one constructor with different parameter lists.

// 📍 No-arg constructor
class Bike1
{
    Bike1()
    {
        System.out.println("Bike is created.\n");
    }
}

// 📍 Parameterized constructor
class Student4
{
    int id;
    String name;

    Student4(int i, String n)
    {
        id = i;
        name = n;
    }
    void display()
    {
        System.out.println(id + "  " + name + "\n");
    }
}

// 📍 Constructor Overloading
class Student5
{
    int id;
    String name;
    int age;
    Student5(int i, String n)
    {
        id = i;
        name = n;
    }
    Student5(int i, String n, int a)
    {
        id = i;
        name = n;
        age = a;
    }
    void display()
    {
        System.out.println(id + "  " + name + "  " + age);
    }
}

public class _4_Constructors_Part_1
{
    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        // 📍 No-arg constructor
        // Automatically calls Bike1() on creation.
        Bike1 b = new Bike1();


        // 📍 Parameterized constructor
        // Automatically calls Student4() on creation.
        Student4 s1 = new Student4(111, "Karan");
        s1.display();

        // 📍 Constructor Overloading
        Student5 s2 = new Student5(112, "Rahul");
        Student5 s3 = new Student5(113, "Shravan", 21);
        s2.display();
        s3.display();
        System.out.println();
    }
}
// OUTPUT:
// Bike is created.

// 111  Karan

// 112  Rahul  0
// 113  Shravan  21
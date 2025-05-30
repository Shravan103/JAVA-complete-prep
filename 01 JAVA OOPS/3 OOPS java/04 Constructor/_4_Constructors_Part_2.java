// 📍 Copy Constructor:
// There is no copy constructor in JAVA. But, we can copy the values of one object to another like copy constructor in C++.
// 3 ways to copy the values of one object into another in JAVA:
//  1) By constructor
//  2) By assigning the values of one object into another without Constructor
//  3) By clone() method of Object class

// 📍 By Constructor:
//      In this example, we are using JAVA constructor to copy the values of one object into another.
class Student6
{
    int id;
    String name;

    Student6(int i, String n)
    {
        id = i;
        name = n;
    }
    // JAVA constructor
    Student6(Student6 s)
    {
        id = s.id;
        name = s.name;
    }

    void display()
    {
        System.out.println(id + "  " + name);
    }
}

// 📍 By assigning the values of one object into another without Constructor:
class Student7
{
    int id;
    String name;

    Student7(int i, String n)
    {
        id = i;
        name = n;
    }
    void display()
    {
        System.out.println(id + "  " + name);
    }
}

public class _4_Constructors_Part_2 {
    public static void main(String[] args) {
        // JAVA constructor
        Student6 s1 = new Student6(111, "Karan");
        Student6 s2 = new Student6(s1);
        s1.display();
        s2.display();

        System.out.println("\n");

        // By assigning the values of one object into another without Constructor
        Student7 s3 = new Student7(112, "Rahul");
        Student7 s4 = new Student7(113, "Rohit");
        s3.id = s4.id;
        s3.name = s4.name;
        s3.display();
        s4.display(); 
    }
}
// OUTPUT:
// 111  Karan
// 111  Karan


// 113  Rohit
// 113  Rohit
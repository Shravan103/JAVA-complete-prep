// 📍 OBJECT:
// Object is an real-world entity that is an instance of class.
// An entity that has STATE and BEHAVIOUR.
// Example: "Pen" is an Object, its name is 'Reynolds' $ 'color' is Red --> STATE
//                              its used to write, 'writting' --> BEHAVIOUR

// 📍 CLASS:
// Group of Objects which have common properties.

// 📍 METHOD:
// Used to express the BEHAVIOUR of an OBJECT.

// 📍 NEW:
// Used to allocate memmory at the run-time.
// All OBJECTS get memory in Heap memory area.

//Student class
class Student
{
    //can define below definitions inside _3_objects_classes class, but its better 
    // to create a seperate class in same file/different file.
    int id;
    String name;

    //methods:
    //To insert a record
    void insertRecord(int idcpy, String namecpy)
    {
        id = idcpy;
        name = namecpy;
    }
    // To display a record
    void displayInfo()
    {
        System.out.println("Method: " + id + " - " + name + "\n");
    }
}

public class _3_objects_classes
{
    // int id = 01;
    // String name = "Shravan";

    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        Student s1 = new Student();
        System.out.println(s1.id + " - " + s1.name + "\n");

        // 📍 3 ways to initialize Object:
        // 1) By reference
        Student s2 = new Student();
        s2.id = 102;
        s2.name = "Sidhu";
        System.out.println(s2.id + " - " + s2.name + "\n");

        // 2) By method
        // method name is ==> insertRecord()
        Student s3 = new Student();
        s3.insertRecord(103,"Aryan");
        s3.displayInfo();

        // 3) By constructor (Later in study)

        // 📍 Anonymous Object:
        // It can be used at the time of object creation.
        // Use only when you have to use object only once.
        // Example: new Student().fact(5)   //if there was a method named fact() to claculate factorial of a number.

        // 📍 Creating multiple objects by one type only
        Student s4 = new Student(), s5 = new Student();
    }
}
// OUTPUT:
// 0 - null

// 102 - Sidhu

// Method: 103 - Aryan

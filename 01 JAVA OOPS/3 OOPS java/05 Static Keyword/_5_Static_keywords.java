// 📍Static Keywords:
// Static keyword is used for memory management mainly.
// We can apply static keyword with Variables, Methods, Blocks and Nested class.
// The static keyword belongs to the class than instance of the class.

// The static can be:
//   1. Static Variable (also known as a class variable)
//   2. Static Method (also known as a class method)
//   3. Static Block
//   4. Static Nested class

// 📍Static Variable:
//   Used mostly as a Count variable.
//   Static Variable Saves memory in the program.
//   Gets memory only once at the time of CLASS loading.
class Student1{
    int rollno;
    String name;
    static String college = "GEC"; // Static variable
    Student1(int r, String n){
        rollno = r;
        name = n;
    }
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}

// 📍Static Method:
//   If you apply static keyword with any method, it is known as a static method.
//   A static method belongs to the class rather than the object of a class.
//   A static method can be invoked without the need for creating an instance of a class.
//   A static method can ONLY access static data member and can change the value of it.(Regular method can access static and non-static data member)
//   Restrictions:
//   ● Static method cannot use non-static data member or call non-static method directly.
//   ● this and super cannot be used in static context.
class Student2{
    int rollno;
    String name;
    static String college = "GEC"; // Static variable

    static void change(){
        college = "IIT";
    }
    Student2(int r, String n){
        rollno = r;
        name = n;
    }
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}

// 📍Static Block:
//   Is used to initialize the static data member.
//   It is executed before the main method at the time of classloading.


public class _5_Static_keywords {
    // 📍Static Block:
    static{
        System.out.println("Static block is invoked - 1");
    }

    public static void main(String[] args) {
        // 📍Static Variable:
        Student1 s1 = new Student1(111, "Karan");
        Student1 s2 = new Student1(222, "Aryan");
        // We can change the college of all objects by the single line of code, Student.college = "PCCE";
        s1.display();
        s2.display();

        System.out.println("\n");

        // 📍Static Method:
        Student2.change();
        Student2 s3 = new Student2(4500, "Shravan");
        s3.display();
    }

    // 📍Static Block:
    static{
        System.out.println("Static block is invoked - 2\n");
    }
}
// 📍 Questions:
// 1. Why is the Java main method static?
// ->  Because the object is not required to call a static method. If it were a non-static method,
//     JVM creates an object first then call main() method that will lead to the problem of extra memory allocation.

// 2. Can we execute a program without the main method?
// ->  No, one of the ways was static block but it was possible till JDK 6.
//    Since JDK 7, it is not possible to execute a Java class without the main method.

// 📍 OUTPUT:
// Static block is invoked - 1
// Static block is invoked - 2

// 111 Karan GEC
// 222 Aryan GEC


// 4500 Shravan IIT
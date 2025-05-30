// 📍 3 types of variables:
// a. Local variables: Its scope is inside a method.
// b. Instance variables: Each object of a class has its own copy of Instance variable, so changing value of Instance variable by one 
//                        object is not dependet on any other object(It remains the same as previous).
// c. Static Variables: A single variable(copy) is shared among all the objects of a class.

public class _2_Types_of_Variables {

    // 📍 Static Variable (shared across all objects)
    static int staticVariable = 100;

    // 📍 Instance Variable (belongs to an instance/object)
    int instanceVariable = 50;

    public void exampleMethod() {
        // 📍 Local Variable (only available inside this method)
        int localVariable = 10;

        System.out.println("1 Local Variable: " + localVariable);
        System.out.println("1 Instance Variable: " + instanceVariable);
        System.out.println("1 Static Variable: " + staticVariable);
    }

    public static void main(String[] args) {
        // Create two objects
        _2_Types_of_Variables obj1 = new _2_Types_of_Variables();
        _2_Types_of_Variables obj2 = new _2_Types_of_Variables();

        // Call method to print variables
        obj1.exampleMethod();

        // Change instance variables independently for each object
        obj1.instanceVariable = 200;
        obj2.instanceVariable = 300;

        System.out.println("\nAfter modifying instance variables:");
        System.out.println("Object 1 instance variable: " + obj1.instanceVariable);
        System.out.println("Object 2 instance variable: " + obj2.instanceVariable);

        //Use classname.staticvariable directly (_2_Types_of_Variables) for calling static variables instead of objects(obj1/obj2)
        _2_Types_of_Variables.staticVariable = 20000;       
        // Static variable is the same across all objects
        System.out.println("\nStatic Variable (shared): " + _2_Types_of_Variables.staticVariable);
        System.out.println("Static Variable (shared): " + _2_Types_of_Variables.staticVariable);
    }
}
// OUTPUT:
// 1 Local Variable: 10
// 1 Instance Variable: 50
// 1 Static Variable: 100

// After modifying instance variables:
// Object 1 instance variable: 200
// Object 2 instance variable: 300

// Static Variable (shared): 20000
// Static Variable (shared): 20000
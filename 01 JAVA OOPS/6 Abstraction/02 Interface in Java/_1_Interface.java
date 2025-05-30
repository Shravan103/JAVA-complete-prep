// 📍 Interface in Java
// Interface in Java is a blueprint of a class. It has static constants and abstract methods only.
// The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body.
// Since Java 8, we can have default and static methods in an interface.
// Since Java 9, we can have private methods in an interface.
// It is used to achieve abstraction and multiple inheritance in Java.
// Java Interface also represents IS-A relationship.

//--------------------------------------------------------------------------------------------------------------------------------

// 📍 It cannot be instantiated just like the abstract class.
// Example:
// 1️⃣ Abstract class:
// Abstract class
// abstract class Animal {
//     // Abstract method (must be implemented by subclasses)
//     abstract void makeSound();
// }

// // Concrete subclass
// class Dog extends Animal {
//     void makeSound() {
//         System.out.println("Bark");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Animal obj = new Animal(); // ❌ ERROR: Cannot instantiate abstract class
//         Animal dog = new Dog(); // ✅ Allowed because Dog provides implementation
//         dog.makeSound(); // Output: Bark
//     }
// }

// 2️⃣ Interface:
// Interface
// interface Vehicle {
//     void start(); // Abstract method (no body)
// }

// // Concrete class implementing interface
// class Car implements Vehicle {
//     public void start() {
//         System.out.println("Car is starting...");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Vehicle v = new Vehicle(); // ❌ ERROR: Cannot instantiate interface
//         Vehicle car = new Car(); // ✅ Allowed because Car implements Vehicle
//         car.start(); // Output: Car is starting...
//     }
// }

//--------------------------------------------------------------------------------------------------------------------------------

// 📍 Why use Java Interface?
// 1. It is used to achieve total abstraction.
// 2. Since Java does not support multiple inheritance in case of class, but by using interface it can achieve multiple inheritance.
// 3. It is also used to achieve loose coupling.
//     → Loose coupling refers to reducing dependencies between components in a system, making them more independent and flexible

//--------------------------------------------------------------------------------------------------------------------------------

//  → 📀 All the methods in an interface are declared with an empty body except:
//      1️⃣ --> default and 
//      2️⃣ --> static methods(since JAVA 8).
//  → Example:
//    1️⃣ Default Methods in Interface:
//        ● default methods allow interfaces to provide a default implementation.
//        ● Subclasses can override it if needed.
// interface Vehicle {
//     void start(); // Abstract method (must be implemented)
    
//     // Default method with implementation
//     default void stop() {
//         System.out.println("Vehicle is stopping...");
//     }
// }
// class Car implements Vehicle {
//     public void start() {
//         System.out.println("Car is starting...");
//     }

//     // Overriding the default method (optional)
//     public void stop() {
//         System.out.println("Car is stopping smoothly...");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Car myCar = new Car();
//         myCar.start();  // Output: Car is starting...
//         myCar.stop();   // Output: Car is stopping smoothly...
//     }
// }

//    2️⃣ Static Methods in Interface:
//        ● static methods belong to the interface itself, not to implementing classes.
//        ● They cannot be overridden.
//        ● They must be called using the interface name (InterfaceName.methodName()).
// interface Utility {
//     static void showMessage() {
//         System.out.println("This is a static method inside an interface.");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Calling the static method from the interface
//         Utility.showMessage(); // Output: This is a static method inside an interface.
//     }
// }

//--------------------------------------------------------------------------------------------------------------------------------

//  → 📀 Methods in an interface are public and abstract by DEFAULT (NOT static or final).
//  → Example:
//    interface Animal {
//        void makeSound();  // Implicitly public and abstract (no need to write public abstract) like "public abstract void makeSound();"
//    }
//  → static methods are allowed but must be explicitly declared as static.

//--------------------------------------------------------------------------------------------------------------------------------

// 📍 How to declare an Interface?
//  SYNTAX:
//  interface <interface_name> {
//      // declare constant fields
//      // declare methods that abstract
//  }

//--------------------------------------------------------------------------------------------------------------------------------
// 📍 Static blank final variable:
// →  A static blank final variable can be initialized only in static block.
// Example:
class A{
    static final int data; //static blank final variable
    static{
        data=50;
    }
}

// 📍 final parameter:
// →  If you declare any parameter as final, you cannot change the value of it.
// Example:
class Bike{
    int cube(final int n){
        //n=n+2; //Compile Time Error
        return n*n*n;
    }
}

public class _3_final_keyword {
    public static void main(String[] args) {
        // 📍 Static blank final variable:
        System.out.println(A.data);

        // 📍 final parameter:
        Bike b=new Bike();
        System.out.println(b.cube(5));
    }
}

// 📝 NOTE:
// In Java, static members belong to the class itself, not to any specific instance. You can call them using:
// Class Name → ClassName.staticVariable or ClassName.staticMethod()
// class Example {
//     static int count = 10; // Static variable

//     static void display() { // Static method
//         System.out.println("Static method called!");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Calling static members without object creation
//         System.out.println(Example.count); // ✅ Accessing static variable
//         Example.display(); // ✅ Calling static method
//     }
// }

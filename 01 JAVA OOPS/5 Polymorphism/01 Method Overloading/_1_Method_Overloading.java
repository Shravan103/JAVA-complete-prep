// 📍 Method Overloading
// If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
// Method Overloading is an example of compile-time polymorphism.
// It increases the readability of the program:
//    ● sum(int,int) & sum(int,int,int) is better than a(int,int) & b(int,int,int)

// 📍 Different ways to overload the method:
//    1. By changing the number of arguments
//    2. By changing the data type
// NOTE: In JAVA, method overloading is not possible by changing the RETURN TYPE of the method only.

// We are using static methods, so we don't need to create an object for the class to call the method.
// 📍1. By changing the number of arguments:
class Adder {
    static int add(int a, int b) {
        return a + b;
    }
    static int add(int a, int b, int c) {
        return a + b + c;
    }
}

// 📍2. By changing the data type of arguments:
class Adder2 {
    static int add(int a, int b) {
        return a + b;
    }
    static double add(double a, double b) {
        return a + b;
    }
}

public class _1_Method_Overloading {
    public static void main(String[] args) {
        // 📍1. By changing the number of arguments:
        System.out.println(Adder.add(11, 11));
        System.out.println(Adder.add(11, 11, 11));

        System.out.println("-------------------");

        // 📍2. By changing the data type of arguments:
        System.out.println(Adder2.add(11, 11));
        System.out.println(Adder2.add(12.3, 12.6));
    }
}
// Output:
// 22
// 33
// -------------------
// 22
// 24.9

// Q1 Can we oveload java main() method?
//  → Yes, by method overloading. You can have any number of main methods in a class by method overloading.
//  → But JVM calls main() method which receives string array as arguments only (public static void main(String[] args)).
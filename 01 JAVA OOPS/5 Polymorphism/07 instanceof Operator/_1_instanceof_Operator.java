// 📍 instanceof Operator:
//  →  instanceof is a binary operator used to test if an object is of a given type(class or subclass or interface)
//  →  aka type comparison operator.
//  →  If we apply instanceof operator with any variable that has null value, it returns false.

// 📍 Simple Exmaple
class simple{

}
class easy extends simple{

}

// 📍 Downcasting with JAVA instanceof operator:
//  →  Downcasting is when a subclass reference points to a parent class object.
//  →  If we perform downcasting directly (without instanceof operator), it will throw a compile-time error: Dog d = new Animal();
//  →  If we perform downcasting by typecasting, it will throw a runtime error: Dog d = (Dog) new Animal();
//  →  To avoid compile-time & runtime error, we can use => instanceof operator.

//  →  Dod d = new Animal(); => downcasting
//  →  Animal a = new Dog(); => upcasting (allowed)

class Animal{

}

class Dog3 extends Animal{
    static void method(Animal a){
        if(a instanceof Dog3)// Always use this instanceof operator check before downcasting, else runtime error may occur
        { 
            // downcasting: Converting Parent reference back to Child
            Dog3 d = (Dog3)a;  // works, since a is Dog3
                               // Will not work if a is not Dog3 i.e Animal a = new Animal(); i.e. runtime error
            System.out.println("ok downcasting performed");     
        }
    }
}

public class _1_instanceof_Operator {
    public static void main(String[] args) {
        // 📍 Simple Exmaple
        simple s = new simple();
        easy e = new easy();
        System.out.println("s instanceof simple: " + (s instanceof simple)); // true
        System.out.println("s instanceof easy: " + (s instanceof easy)); // false
        System.out.println("e instanceof simple: " + (e instanceof simple)); // true
        System.out.println("e instanceof easy: " + (e instanceof easy)); // true

        // 📍 instanceof with null value
        simple s1 = null;
        System.out.println("s1 instanceof simple: " + (s1 instanceof simple)); // false

        System.out.println("\n");

        // 📍 Downcasting with JAVA instanceof operator
        Animal a = new Dog3();
        Dog3.method(a);
    }
}
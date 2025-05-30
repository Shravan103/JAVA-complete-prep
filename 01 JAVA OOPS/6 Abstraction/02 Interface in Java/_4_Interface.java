// 📍 Interface in Java:

// 📍 Java8 Default method in Interface
interface Drawable{
    void draw();
    default void msg(){
        System.out.println("default method1");
    }
}
class Rectangle implements Drawable{
    @Override
    public void draw(){
        System.out.println("drawing rectangle1");
    }
}

// 📍 Java8 Static method in Interface
interface Drawable2{
    void draw2();
    static int cube(int x){return x*x*x;}
}
class Rectangle2 implements Drawable2{
    @Override
    public void draw2(){
        System.out.println("Drawing a Rectangle2");
    }
}

// 📍 Q. What is marker / tagged interface?
//  →  A interface which has no member is known as a marker or tagged interface.
//  →  They are used to provide some essential information to the JVM so that JVM may perform some useful operation.
// Example:
// interface Serializable{
// }

// 📍 Nested interface:
//  →  Interface inside a interface
// Example:
// interface printable12{
//     void print12();
//     interface MessagePrintable12{
//         void msg();
//     }
// }

public class _4_Interface {
    public static void main(String[] args) {
        // 📍 Java8 Default method in Interface
        Drawable d = new Rectangle();
        d.draw();  // OUTPUT: drawing rectangle
        d.msg();  // OUTPUT: default method
        Rectangle obj = new Rectangle();
        obj.draw();  // OUTPUT: drawing rectangle
        obj.msg();  // OUTPUT: default method

        // 📍 Java8 Static method in Interface
        Drawable2 d2 = new Rectangle2();
        d2.draw2();
        System.out.println(Drawable2.cube(3));
    }
}

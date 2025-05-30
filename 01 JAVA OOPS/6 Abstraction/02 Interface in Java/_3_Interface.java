// 📍 Interface in Java:

// 📍 Multiple inheritance in Java by Interface: Example 1
// If a class implements multiple interfaces, or an interface extends multiple interfaces, it is known as multiple inheritance.
// Example:
// Parent 1
interface printable1{
    void print();
}
// Parent 2
interface showable1{
    void show();
}
// Child of both Parent 1 and Parent 2
class A7 implements printable1, showable1{
    @Override
    public void print(){
        System.out.println("Hello printable1");
    }
    @Override
    public void show(){
        System.out.println("Welcome showable1");
    }
}

// 📍 Multiple inheritance in Java by Interface: Example 2
interface printable2{
    void print();
}
interface showable2{
    void print();
}
class A8 implements printable2, showable2{
    @Override
    public void print(){
        System.out.println("Hello printable2 and showable2");
    }
}

// 📍 Interface Inheritance
//  →  A class implements an interface, but one interface extends another interface.
interface printable3{
    void print();
}
interface showable3 extends printable3{
    void show();
}
class A9 implements showable3{
    @Override
    public void print(){
        System.out.println("Hello printable3");
    }
    @Override
    public void show(){
        System.out.println("Welcome showable3");
    }
}

public class _3_Interface {
    public static void main(String[] args) {
        // 📍 Multiple inheritance in Java by Interface: Example 1
        A7 obj = new A7();
        obj.print(); // OUTPUT: Hello printable1
        obj.show(); // OUTPUT: Welcome showable1
        printable1 pr = new A7();
        pr.print(); // OUTPUT: Hello printable1
        // pr.show(); // Error: show() is not a method of printable
        showable1 sh = new A7();
        sh.show();  // OUTPUT: Welcome showable1
        // sh.print(); // Error: print() is not a method of showable

        // 📍 Multiple inheritance in Java by Interface: Example 2
        A8 obj2 = new A8();
        obj2.print(); // OUTPUT: Hello printable2 and showable2

        // 📍 Interface Inheritance
        A9 obj3 = new A9();
        obj3.print(); // OUTPUT: Hello printable3
        obj3.show(); // OUTPUT: Welcome showable3
    }
}

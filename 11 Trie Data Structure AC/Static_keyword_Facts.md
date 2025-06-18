#  ❤️ STATIC CLASSES
## ✅ 1. If you're inside the outer class:
### 📦 CODE:
public class Outer {
    static class Inner {
        void show() {
            System.out.println("Inside Inner");
        }
    }

    public static void main(String[] args) {
        Inner obj = new Inner(); // ✅ Allowed: we're inside Outer
        obj.show();
    }
}

## ✅ 1. If you're Outside the outer class:
### 📦 CODE:
public class Outer {
    static class Inner {
        void show() {
            System.out.println("Hello from Inner");
        }
    }
}

Outer.Inner obj = new Outer.Inner();
obj.show();

#  ❤️ OTHER FACTS ABOUT STATIC CLASSES
## ✅ Static Block (Static Initializer Block)
- Runs once when the class is loaded.
- Executes before the main() method or any static method/field is accessed.
### 📦 CODE:
class Example {
    static int x;

    static {
        x = 100;
        System.out.println("Static block executed");
    }
}

## ✅ Static Methods Cannot Be Overridden (But Hidden)
### 📦 CODE:
class A {
    static void show() {
        System.out.println("A");
    }
}
class B extends A {
    static void show() {
        System.out.println("B");
    }
}
A obj = new B();
obj.show(); // prints "A", not "B"

## ✅ Memory Efficiency — One Copy Per Class
- Static members are shared across all objects.
### 📦 CODE:
class Counter {
    static int count = 0;

    Counter() {
        count++;
        System.out.println(count);
    }
}

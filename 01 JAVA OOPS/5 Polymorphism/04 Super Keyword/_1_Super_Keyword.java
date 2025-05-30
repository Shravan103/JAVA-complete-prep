// 📍 Super Keyword
//  → The super keyword in Java is a reference variable that is used to refer to the immediate parent class object.
//  → Whenever you create the instance of subclass, an instance of parent class is created implicitly 
//    which is referred by super reference variable.

// 📍 Usage of Java super Keyword:
//  1. super can be used to refer immediate parent class INSTANCE VARIABLE.
//  2. super can be used to invoke immediate parent class METHOD.
//  3. super() can be used to invoke immediate parent class CONSTRUCTOR.

// 📍 1: super is used to refer immediate parent class INSTANCE VARIABLE.
//  → We can use super keyword to access the data member or field of parent class.
//  → It is used if parent class and child class have same members
class Animal {
  String color = "White";
}

class Dog extends Animal {
  String color1 = "Black";
  // String color = "Black";  // Works

  void printColor() {
    System.out.println(color1);       // prints color of Dog class
    // System.out.println(color);       // Works
    System.out.println(super.color); // prints color of Animal class
  }
}
public class _1_Super_Keyword {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.printColor();
  }
}
// Output:
// Black
// White
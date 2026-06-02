// 📍 2. super can be used to invoke immediate parent class METHOD.
//  →  The super keyword can also be used to invoke the parent class method.
//  →  It should be used if subclass contains the same method as parent class.
//  →  In other words, it is used if method is overridden.

class Animal {
  void eat() {
    System.out.println("eating...");
  }
}

class Dog extends Animal {
  @SuppressWarnings("override")
  void eat() {
    System.out.println("eating bread...");
  }
  void bark() {
    System.out.println("barking...");
  }
  void work() {
    super.eat();
    eat();
    bark();
  }
}

public class _2_Super_Keyword {
    public static void main(String[] args) {
      Dog d = new Dog();
      d.work();
    }
}
// Output:
// eating...
// barking...
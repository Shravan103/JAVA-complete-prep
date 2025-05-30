// 📍 3. super() can be used to invoke immediate parent class CONSTRUCTOR.
//  →  Can also be used to invoke the parent class constructor.
//  →  As we know that default constructor is provided by compiler automatically if there is no constructor.
//  →  But it also adds super() as the first statement in each class constructor.

class Animal {
  Animal() {
    System.out.println("Animal is created");
  }
}
class Dog extends Animal {
  Dog() {
    super();    // invokes parent class constructor i.e. Animal() in Animal class, if we remove super() then also by default it will be there.
    System.out.println("Dog is created");
  }
}

public class _3_Super_Keyword {
    public static void main(String[] args) {
      @SuppressWarnings("unused")
      // 📍 3. super() can be used to invoke immediate parent class CONSTRUCTOR.
      Dog d = new Dog();

      // 📍 Real Application:
      Employee e = new Employee(1, "John", 45000);
      e.display();
    }
}

// Output:
// Animal is created
// Dog is created

// 📍 Real Application:
class Person {
  int id;
  String name;
  Person(int id, String name) {
    this.id = id;
    this.name = name;
  }
}
class Employee extends Person {
  float salary;
  Employee(int id, String name, float salary) {
    super(id, name);    // reusing parent class constructor
    this.salary = salary;
  }
  void display() {
    System.out.println(id + " " + name + " " + salary);
  }
}

// Output:
// 1 John 45000.0
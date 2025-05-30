// 📍 Agregation:
// If a class has an entity reference, it is known as Aggregation. Aggregation represents HAS-A relationship.
// For Example: Employee object contains many informations such as id, name, emailId etc. 
// It contains one more OBJECT named address, which contains its own informations such as city, state, country, zipcode etc.
// In such case, Employee has an entity reference "address", so relationship is Employee HAS-A "address".
// class Employee{
//     int id;
//     String name;
//     Address address; // Address is a class
// }

class Operation{
    int square(int n)
    {
        return n*n;
    }
}
class Circle{
    Operation op; // Aggregation
    double pi = 3.14;
    
    double area(int radius)
    {
        op = new Operation();
        int rsquare = op.square(radius); // code reusability (i.e. delegates the method call).
        return pi*rsquare;
    }
}
public class _1_Aggregation {
    public static void main(String[] args) {
        Circle c = new Circle();
        double result = c.area(5);
        System.out.println(result);
    }
}
// Output: 78.5

// Q1. When to use Aggregation?
//  →  Code reusability is best achieved by aggregation (when there is no is-a relationship). 
//  →  Inheritance should be used only if the relationship is-a is maintained throughout the lifetime of the objects involved;
//     otherwise, aggregation is the best choice.


// 📍 Understanding meaningful example of Aggregation:
// In this example, Employee has an object of Address, address object contains its own informations such as city, state, country, zipcode etc.
// So, Employee class has an entity reference address, so relationship is Employee HAS-A address.
// Address.java
// Emp.java
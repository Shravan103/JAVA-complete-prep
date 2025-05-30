// 📍 Covariant Return Type:
//  →  Specifies that the return type may vary in the same direction as the subclass.
//  →  Before Java5, it was not possible to override any method by changing the return type.
//  →  But now, since Java5, it is possible to override the method by changing the return type if subclass overrides any method 
//     whose return type is Non-Primitive but it changes its return type to subclass type.

// Example:
class A {
    A get()
    {
        return this;
    }
}
class B1 extends A {
    @Override
    B1 get()
    {
        return this;
    }
    void message()
    {
        System.out.println("welcome to covariant return type");
    }
}

public class _1_Covariant_Return_Type
{
    public static void main(String[] args)
    {
        new B1().get().message();
        A a = new A();
        a.get();
    }
}
// OUTPUT:
// welcome to covariant return type

// 📍new B1().get().message();
//  . new B1() - creates a new object of B1.
//  . get() - calls the overridden get() method in B1, which returns this (i.e., the current B1 object).
//  . message() - is then called on the returned B1 object


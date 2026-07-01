// 📍 Access Modifiers:
//  There are 2 types of modifiers:
//  1. Access Modifiers
//  2. Non-Access Modifiers

// 📍 Access Modifiers:
//  Access Modifiers in Java specifies type accessibility of a field, method, constructor, or class.
//  We can change the access levels of fields, constructors, method, and class by applying the access modifiers on it.

//  4 Types of Java access modifiers:
// 1️⃣ Private: [MOST RESTRICTIVE]
//  →  The access level of a private modifier is only within the class.
//  →  It cannot be accessed from outside the class.

// 2️⃣ Default:
//  →  The access level of a default modifier is only within the package.
//  →  It cannot be accessed from outside the package.
//  →  If you do not specify the access level it will be the default.

// 3️⃣ Protected:
//  →  The access level of a protected modifier is within the package and outside the package through child class.
//  →  If you do not make the child class, it cannot be accessed from outside the package.

// 4️⃣ Public: [LEAST RESTRICTIVE]
//  →  The access level of a public modifier is everywhere.
//  →  It can be accessed from within the class, outside the class, within the package and outside the package.

// 📍 Non-Access Modifiers
//  →  There are so many non-access modifiers, such as static, abstract, synchronized, native, volatile, transient, etc.
//  →  Here, we are going to learn access modifiers only.

// 📍 Java Access Modifiers with Method Overriding
// If you are overriding any method, overridden method (i.e declared in subclass) must not be more restrictive.
class A{
    protected void msg(){
        System.out.println("Hello java PARENT");
    }
}
class Simple extends A{
    // Below will give Compilation Error, since default is more restrictive than Protected
    // @Override
    // void msg(){
    //     System.out.println("Hello Java CHILD");
    // }


    // Can use below approach:
    @Override
    public void msg(){
        System.out.println("Hello Java CHILD");
    }
}

public class _1_Access_modifiers{
    public static void main(String[] args) {
        Simple obj = new Simple();
        obj.msg();      // Hello Java CHILD
    }
}
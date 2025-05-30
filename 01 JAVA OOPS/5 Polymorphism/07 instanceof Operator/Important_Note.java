// 🚀 Given Code Snippet
//THIS IS DONE AT COMPILE TIME (EARLY BINDING) AND OVERRIDNG IS DONE AT RUNTIME(LATE BINDING)
// THIS MEANS METHOD RESOLUTION IS DONE AT COMPILE TIME.
class Parent {
    void p() {
        System.out.println("Parent class p() method");
    }
}
class Child extends Parent {
    void c() { 
        System.out.println("Child class c() method");
    }
}
public class Important_Note {
    public static void main(String[] args) {
        Parent obj4 = new Parent();
        // obj4.p();    // output: Parent class p() method
        // obj4.c(); // ❌ Compilation Error - c() is not in Parent

//-----------------------------------------------------------------------------------

        Child obj5 = new Child();
        obj5.p();
        obj5.c();

//-----------------------------------------------------------------------------------


        // 📌 Object Declaration
        Parent obj3 = new Child();

        // ✅ Methods You Can Call Using obj3
        obj3.p(); // ✅ Allowed - p() is in Parent

        // ❌ Methods You CANNOT Call
        // obj3.c(); // ❌ Compilation Error - c() is not in Parent
    }
}

// 📌 Object Declaration
// Parent obj3 = new Child();

// ✅ Methods You Can Call Using obj3
// -  You can only call methods that are defined in the Parent class because obj3 is declared as Parent.

// Valid Method Call:
// obj3.p(); // ✅ Allowed - p() is in Parent
// Output:
// Parent class p() method

// ❌ Methods You CANNOT Call
// obj3.c(); // ❌ Compilation Error - c() is not in Parent

// 🔹 Why?
// - obj3 is declared as Parent, so it can only access methods defined in Parent.
// - c() is defined only in Child, and since obj3 is of type Parent, it has no knowledge of c().
// - Java does not allow calling child-specific methods using a parent-type reference.
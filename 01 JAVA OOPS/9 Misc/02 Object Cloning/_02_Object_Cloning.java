// 📍 Object Cloning:
// 2️⃣ Deep Copy (Manually cloning nested objects):
//  ● Immutable objects don't require a deep copy:
//  →  Since they can't be changed, copying their reference is safe.
//  →  Example: In our Student18 class, String name doesn't need explicit deep copying.
//  ● Mutable objects need a deep copy to prevent unintended changes:
//  →  If an object contains mutable fields (like StringBuilder or ArrayList), 
//  →  a shallow copy only copies references, leading to unwanted modifications.

class Student18 implements Cloneable {
    int rollno;
    String name;  // Immutable, but we'll still create a new String for deep copy

    Student18(int rollno, String name) {
        this.rollno = rollno;
        this.name = new String(name); // Explicit deep copy (not needed for String)
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Student18(this.rollno, this.name); // Manually create a new object
    }
}

public class _02_Object_Cloning {
    public static void main(String args[]) {
        try {
            Student18 s1 = new Student18(101, "amit");
            Student18 s2 = (Student18) s1.clone();

            System.out.println("Before modification:");
            System.out.println("s1: " + s1.rollno + " " + s1.name);
            System.out.println("s2: " + s2.rollno + " " + s2.name);

            // Modify the cloned object's name
            s2.name = "rahul";

            System.out.println("\nAfter modifying s2.name:");
            System.out.println("s1: " + s1.rollno + " " + s1.name); // Remains unchanged
            System.out.println("s2: " + s2.rollno + " " + s2.name);
        } catch (CloneNotSupportedException c) {
        }
    }
}

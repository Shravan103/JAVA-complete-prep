// Shallow Cloning using StringBuilder
class Student18 implements Cloneable {
    int rollno;
    StringBuilder name; // Mutable field

    Student18(int rollno, StringBuilder name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }
}

public class _03_Object_Cloning {
    public static void main(String args[]) throws CloneNotSupportedException {
        Student18 s1 = new Student18(101, new StringBuilder("amit"));
        Student18 s2 = (Student18) s1.clone();

        System.out.println("Before Modification:");
        System.out.println("s1.name: " + s1.name);
        System.out.println("s2.name: " + s2.name);

        s2.name.append(" kumar"); // Modifies original object!

        System.out.println("After Modification:");
        System.out.println("s1.name: " + s1.name); // Output: amit kumar
        System.out.println("s2.name: " + s2.name); // Output: amit kumar
    }
}

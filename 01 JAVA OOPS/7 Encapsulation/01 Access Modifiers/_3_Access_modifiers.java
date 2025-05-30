// 2️⃣ Default:
// If you dont use any modifier, it is treated as "default" by default.
// The default modifier is accessible only within package.
// It cannot be accessed from outside the package.
// Provides more accessibility than private, but more restrictive than protected and public.
// Example:
// Everything is within the same package, a file in .java is considered a package here.
class A{
    int data = 20;
    void display(){
        System.out.println("Default Access Modifier 1 : " + data);
    }
}

public class _3_Access_modifiers {
    public static void main(String[] args) {
        A obj = new A();
        obj.display();
    }
}

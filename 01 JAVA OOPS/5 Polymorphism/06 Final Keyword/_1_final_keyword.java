// 📍 Final Keyword:
// used to restrict the user.
// final can be used with variable, method, class .

// 📍 1. final variable:
// If you make any variable as final, you cannot change the value of final variable (it will be constant).
// A final variable that has no value is called a blank final variable or uninitialized final variable.
// It can be initialized in the constructor only.
// The blank final variable can be static also which will be initialized in the static block only.
// Example:
class Bike9{
    final int speedlimit = 90; // final variable
    void run(){
        // speedlimit = 400; // Compile Time Error
        System.out.println("Speed Limit cannot be changed: " + speedlimit);
    }
    public static void main(String args[]){
        Bike9 obj=new Bike9();
        obj.run();
    }
}

// 📍 2. final method:
// If you make any method as final, you cannot override it.
// Example:
class Bike{
    final void run(){
        System.out.println("running");
    }
}
class Honda extends Bike{
    // void run(){System.out.println("running safely with 100kmph");} // Compile Time Error
}

// 📍 3. final class:
// If you make any class as final, you cannot extend it.
// Example:
@SuppressWarnings("unused")
final class Bike2{}
// class Honda2 extends Bike2{} // Compile Time Error


public class _1_final_keyword{
    public static void main(String[] args) {
        // 📍 1. final variable:
        Bike9 obj = new Bike9();
        obj.run();

        // 📍 2. final method:
        Honda honda= new Honda();
        honda.run();
    }
}

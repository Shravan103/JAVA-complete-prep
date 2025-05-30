// 1️⃣ Private:
// Accessible only within the class.
// NOTE: A class cannot be private or protected except nested class.

// 📍 Example 1:
class A1{
    private int data1 = 40;
    private void msg1(){
        System.out.println("Hello Private 1");
    }
}

// 📍 Role of private constructor:
// If you make any class constructor private, you cannot create the instance of that class from outside the class.
// Example:
class A2{
    private A2(){

    }
    void msg2(){
        System.out.println("Hello Private Constructor 2");
    }
}
public class _2_Access_modifiers {
    public static void main(String[] args) {
        // 📍 Example 1:
        @SuppressWarnings("unused")
        A1 obj1 = new A1();
        // System.out.println(obj.data);   //Compilation Error
        // obj.msg()    //Compilation Error

        // 📍 Role of private constructor:
        // A1 obj2 = new A1()  //Compilation Error
    }
}

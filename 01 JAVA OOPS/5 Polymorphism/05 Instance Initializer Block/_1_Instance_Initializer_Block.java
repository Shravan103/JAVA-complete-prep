// 📍 Instance Initializer Block:
// Used to initialize the instance data member.
// It runs each time when object of the class is created.
// They run every time an object is created, before the constructor body.

class Bike8 {
    @SuppressWarnings("unused")
    int speed;
    Bike8() {
        System.out.println("constructor is invoked");
    }

    {
        System.out.println("instance initializer block invoked");
    }
}
public class _1_Instance_Initializer_Block {
    public static void main(String[] args) {
        Bike8 b1 = new Bike8();
        Bike8 b2 = new Bike8();
    }
}

// Output:
// instance initializer block invoked
// constructor is invoked
// instance initializer block invoked
// constructor is invoked

// 📍 NOTE:
// In the above example, It may look like, Instance Initializer Block is invoked at the time of object creation before constructor.
// But, The java compiler copies the instance initializer block in the constructor after the first statement super(),
// so FIRSTLY THE CONSTRUCTOR IS INVOKED.


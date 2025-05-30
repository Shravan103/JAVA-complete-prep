// 📍 Instance Initializer Block: Workflow
class A
{
    A()
    {
        System.out.println("parent class constructor invoked");
    }
}
class B2 extends A
{
    B2()
    {
        super();
        System.out.println("child class constructor invoked");
    }
    {
        System.out.println("instance initializer block is invoked");
    }
}

public class _2_Instance_Initializer_Block {
    public static void main(String[] args) {
        B2 b1 = new B2();
    }
}
// OUTPUT:
// parent class constructor invoked
// instance initializer block is invoked
// child class constructor invoked
class A{
    void methA(){
        System.out.println("Method A");
    }
}
class B extends A{
    void methB(){
        System.out.println("Method B");
    }
}
public class sample{
    public static void main(String[] args) {
        A ob1 = new A();
        ob1.methA();  //Output: Method A
        // ob1.methB();  //Error: cannot find symbol

//------------------------------------------------------------------------------------------------------

        B ob2 = new B();
        ob2.methA();  //Output: Method A
        ob2.methB();  //Output: Method B

//------------------------------------------------------------------------------------------------------

        A ob3 = new B();
        ob3.methA();  //Output: Method A
        // ob3.methB();  //Error: cannot find symbol

//------------------------------------------------------------------------------------------------------

        // B ob4 = new A();  //Error: incompatible types: A cannot be converted to B

//------------------------------------------------------------------------------------------------------
    }
}
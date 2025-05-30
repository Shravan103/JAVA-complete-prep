package pack;
public class A {
    // msg() can only be accessible by a child of this class
    protected void msg(){
        System.out.println("Hello");
    }
}
//javac -d . pack/A.java
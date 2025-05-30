package mypack;
import pack.*;
public class B extends A{
    public static void main(String[] args) {
        B obj = new B();
        obj.msg();
    }
}
// javac -d . mypack/B.java
// java mypack.B
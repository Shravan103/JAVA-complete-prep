/*
 * Types of operators:    
 * 1] Unary Operators     
 * 2] Arithmetic Operators
 * 3] Shift Operators     
 * 4] Relational Operators
 * 5] Bitwise Operators   
 * 6] Logical Operators   
 * 7] Ternary Operators   
 * 8] Assignment Operators
 */

 public class _3_Types_of_Operators {

    public static void main(String[] args) {

        // Unary Operators
        int a = 10;
        System.out.println("Unary Operators:");
        System.out.println("++a: " + (++a));//a=11
        System.out.println("--a: " + (--a));//a=10
        System.out.println("a++: " + (a++));//a=11
        System.out.println("a after a++: " + a); 
        System.out.println("a--: " + (a--));//a=10
        System.out.println("a after a--: " + a);

        // Arithmetic Operators
        int x = 20, y = 10;
        System.out.println("\nArithmetic Operators:");
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));

        // Shift Operators
        int num = 8;
        System.out.println("\nShift Operators:");
        System.out.println("num << 1 = " + (num << 1));// 2^1 = 2 ==> 8*2=16
        System.out.println("num >> 1 = " + (num >> 1));// 2^1 = 2 ==> 8/2=16

        // Relational Operators
        int p = 10, q = 20;
        System.out.println("\nRelational Operators:");
        System.out.println("p == q: " + (p == q));
        System.out.println("p != q: " + (p != q));
        System.out.println("p > q: " + (p > q));
        System.out.println("p < q: " + (p < q));

        // Bitwise Operators
        int num1 = 5, num2 = 3;
        System.out.println("\nBitwise Operators:");
        System.out.println("num1 & num2 = " + (num1 & num2));
        System.out.println("num1 | num2 = " + (num1 | num2));
        System.out.println("num1 ^ num2 = " + (num1 ^ num2));
        System.out.println("~num1 = " + (~num1));

        // Logical Operators
        boolean A = true, B = false;
        System.out.println("\nLogical Operators:");
        System.out.println("A && B = " + (A && B));
        System.out.println("A || B = " + (A || B));
        System.out.println("!A = " + (!A));

        // Ternary Operators
        num = 15;
        System.out.println("\nTernary Operators:");
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is: " + result);

        // Assignment Operators
        int value = 10;
        System.out.println("\nAssignment Operators:");
        value += 5;
        System.out.println("value += 5: " + value);
        value -= 3;
        System.out.println("value -= 3: " + value);
        value *= 2;
        System.out.println("value *= 2: " + value);
        value /= 4;
        System.out.println("value /= 4: " + value);
    }
}


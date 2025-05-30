// Functions and Methods
// Function : It is a block of code that takes INPUT, performs OPERATION and produces a OUTPUT
// Function Syntax:
// PUBLIC STATIC returnType functionName(type arg1,type arg2,....)
// {
//     // operations....
// }
// returnType:
// 1. int: returns interger type variable
// 2. float: returns float type variable
// 3. void: no return

//Functions are arranged as STACKS in main memmory called as STACK FRAME.
//Difference between FUNCTIONS and METHODS
// Functions - called directly.
// Methods - called through object of class

import java.util.*;

public class seven
{   //Prints my name on screen.
    public static void printMyName(String name)     /*void since it only prints my name and doesn't return any variable*/
    {
        System.out.println(name);
    }
    //calculates the sum of two numbers and returns the value
    public static int calculateSum(int a, int b)
    {
        int sum = a + b;
        return sum;
    }
    
    //Make a function to multiply 2 numbers and return product
    public static int calculateProduct(int a, int b)
    {
        return a*b;     //directly returning the product
    }

    //To calculate the factorial of a number
    public static void printFactorial(int n)
    {
        if (n<0)
        {
            return;
        }
        int factorial = 1;
        for(int i=n;i>=1;i--)
        {
            factorial=factorial*i;
        }
        System.out.println("Factorial of "+ n +" = "+ factorial);
        return;     //no need of return in void.....written casually for now, so that we remember it.
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // printMyName(name);      //Calling the function

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a, b);
        // System.out.println("Sum of two numbers is "+ sum);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println("Product of two numbers is "+ calculateProduct(a, b));

        int n = sc.nextInt();
        printFactorial(n);
        sc.close();
    }

}

// VARIABLE IN JAVA INPUT OUTPUT LECTURE2
// System.out.print("Hello world");
//    ^
//    |
//    |
//  class

//Data type(according to 64bit machine)
// byte--1byte=8bits
// short
// char--2bytes
// boolean--1byte
// int--4bytes
// long--8bytes
// float--4bytes
// double--8bytes

//priority[ * / %   >   +- ]
//left to right
//parenthesis() have highest priority

//Input
import java.util.*;     //important for taking input from user
//next()--->doesnt accept the space
//intead use
//nextLine()


public class two {

    public static void main(String[] args) {
        // System.out.print("hello world----");   //no newline
        // System.out.println("Hello world using ln");    //newline at the end of the sentence
        // System.out.print("hello world using the newline character\n");  //newline using \n character
        // System.out.println("Hello world sample");

        //datatypes,variables,operators.
        // int a=20;
        // int b=10;
        // int sum=a+b;
        // int diff=a-b;
        // int mul=a*b;
        // System.out.println(sum);
        // System.out.println(a+b);
        // System.out.println(diff);
        // System.out.println(a-b);
        // System.out.println(mul);
        // System.out.println(a*b);

        // Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name= sc.nextLine();     //can use next() for only taking input as one word
        System.out.print("Name is : ");
        System.out.println(name);
        sc.close();
    }
}

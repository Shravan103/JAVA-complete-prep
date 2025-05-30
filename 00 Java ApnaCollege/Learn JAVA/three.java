//  CONDITIONAL STATEMENTS/IF-ELSE, SWITCH,BREAK/ LECTURE 3
import java.util.*;

public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // to check if u are adult/underage
        // System.out.print("Enter the age: ");
        // int age = sc.nextInt();
        // if(age>=18)
        // {
        //     System.out.println("You are an adult");
        // }
        // else
        // {
        //     System.out.println("You are underage");
        // }

        // To check if a number is odd/even
        // System.out.print("Enter a number: ");
        // int num=sc.nextInt();
        // if(num%2==0)
        // {
        //     System.out.println("Even number.");
        // }
        // else
        // {
        //     System.out.println("Odd number.");
        // }

        //Using if else-if else statements
        // System.out.println("Enter two numbers:");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if(a>b)
        //     System.out.println("a is greater than b");
        // else if(a<b)
        //     System.out.println("b is greater then a");
        // else
        //     System.out.println("a and b is equal");

        //Using Switch statement
        System.out.print("Enter the button number(1/2/3): ");
        int button = sc.nextInt();
        switch(button)
        {
            case 1 :System.out.println("Hello");
                    break;
            
            case 2 :System.out.println("Namaste");
                    break;
            
            case 3 :System.out.println("Bonjour");
                    break;

            default :System.out.println("Invalid button");
        }

        sc.close();
    }
}

//LOOPS IN JAVA/ LECTURE 4
import java.util.*;
public class four{
    public static void main(String[] args) {
        //For printing HELLO WORLD 3 times
        // for(int counter=0;counter<3;counter=counter+1)
        // {
        //     System.out.println("Hello world");
        // }

        //For printing numbers from 0 to 10
        // for(int count=0;count<11;count++)
        // {
        //     System.out.print(count+" ");
        // }

        //While loop
        //For printing numbers from 0 to 10
        // int i=0;
        // while(i<11)
        // {
        //     System.out.print(i+" ");
        //     i++;
        // }

        //do while loop
        //For printing numbers from 0 to 10
        // int j=0;
        // do {
        //     System.out.print(j+" ");
        //     j++;
        // } while (j<11);

        //Print sum of n natural numbers
        // int sum = 0;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter value of n: ");
        // int n = sc.nextInt();
        // for(int i=1;i<=n;i++)
        // {
        //     sum = sum + i;
        // }
        // System.out.println("Sum = "+sum);

        //Print the table of a number input by the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int no = sc.nextInt();
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(no+" * "+i+" = "+no*i);
        }
        sc.close();

    }
}

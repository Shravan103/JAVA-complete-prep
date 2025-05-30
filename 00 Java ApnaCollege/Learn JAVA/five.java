// 9 BEST PATTERNS IN JAVA || LECTURE 5
//Assume pattern as matrix where
//Rows = outer loop and columns = inner loops
// import java.util.*;

// import java.util.regex.Pattern;

public class five
{
    public static void main(String[] args) {
        //PATTERN 1
        // *  *  *  *  *  
        // *  *  *  *  *
        // *  *  *  *  *
        // *  *  *  *  *
        // for(int i=1;i<=4;i++)
        // {
        //     for(int j=1;j<=5;j++)
        //     {
        //         System.out.print("*  ");
        //     }
        //     System.out.println();
        // }

        //PATTERN 2
        // * * * * * 
        // *       *
        // *       *
        // * * * * *
        // for(int i=1;i<=4;i++)
        // {
        //     for(int j=1;j<=5;j++)
        //     {
        //         if(i==1 || j==1 || i==4 || j==4)
        //             System.out.print("* ");
        //         else
        //             System.out.print("   "); 
        //     }
        //     System.out.println();
        // }

        //PATTERN 3
        // * 
        // * * 
        // * * *
        // * * * *
        // for(int i=1;i<=4;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //PATTERN
        //     *
        //    **
        //   ***
        //  ****
        for (int i = 1; i <= 4; i++)
        {
            for (int j = i; j <= 4; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
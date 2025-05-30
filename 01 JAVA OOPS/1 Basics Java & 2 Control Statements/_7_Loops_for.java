
public class _7_Loops_for {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // 👉 Simple FOR loop
        for (var i = 1; i <= 10; i++) {
            System.out.print(i + "  ");
        }

        System.out.println("\n\n");

        // 👉 Pyramid Examplec 1
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");

        // 👉 Pyramid Examplec 2
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");

        // 👉 For-each loop: Used to traverse an array/collection & no need of increment value.
        //                    Works on element basis and not index.
        //                    Returns element one by one in the defined variable.
        //                    Syntax: for(TYPE var:array){}
        int arr[] = {12, 13, 14, 15, 16, 17};
        for (int i : arr) {
            System.out.print(i + "  ");
        }

        System.out.println("\n\n");

        // 👉 Labelled for loop
        aa:
        for (int i = 1; i <= 5; i++)
        {
            bb:
            for(int j=1; j<=5; j++)
            {
                if(i==2 && j==2)
                {
                    break aa;
                }
                System.out.println(i + "  " + j);
            }
        }

        System.out.println("\n");

        // 👉 Infinite for loop
        // for(;;){}        //do not use anywhere
    }
}
// OUTPUT:
// 1  2  3  4  5  6  7  8  9  10  


// *
// **
// ***
// ****
// *****


// *****
// ****
// ***
// **
// *


// 12  13  14  15  16  17


// 1  1
// 1  2
// 1  3
// 1  4
// 1  5
// 2  1
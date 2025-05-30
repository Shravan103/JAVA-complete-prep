// CONTINUE: It is used in loop control when you need to jump to the next iteration of the loop.
//           In case of inner loop, it continues the inner loop only.
//           It has two parts: 1) Continue 2)Jump statement

public class _11_continue_statement
{
    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        // 📍 Simple continue statement
        for (int i = 0; i < 10; i++)
        {
            if(i==5)
            {
                continue;
            }
            System.out.print(i + "  ");
        }

        System.out.println("\n\n");

        // 📍 Continue statement within inner loop
        for (int i = 1; i <= 4; i++)
        {
            System.out.println( i + ":");
            for (int j = 1; j <= 10; j++)
            {
                if(j==5)
                {
                    continue;
                }
                System.out.print(j + "  ");
            }
            System.out.println();
        }

        System.out.println("\n\n");

        // 📍 continue statement with label
        aa:
        for (int i = 1; i <= 4; i++)
        {
            bb:
            for(int j=1; j<=4; j++)
            {
                if(i==2 && j==2)
                {
                    continue aa;
                }
                System.out.println(i + "  " + j);
            }
        }
    }
}
// OUTPUT:
// 0  1  2  3  4  6  7  8  9  


// 1:
// 1  2  3  4  6  7  8  9  10  
// 2:
// 1  2  3  4  6  7  8  9  10  
// 3:
// 1  2  3  4  6  7  8  9  10  
// 4:
// 1  2  3  4  6  7  8  9  10  



// 1  1
// 1  2
// 1  3
// 1  4
// 2  1
// 3  1
// 3  2
// 3  3
// 3  4
// 4  1
// 4  2
// 4  3
// 4  4
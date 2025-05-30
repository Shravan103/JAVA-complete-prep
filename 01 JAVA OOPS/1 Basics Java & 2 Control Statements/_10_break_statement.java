// BREAK: when a break statement is encountered inside a loop, the loop is immediately terminated 
//        and the program control resumes at the next statement.

public class _10_break_statement
{
    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        // 📍 Simple demonstration of break statement
        for (int i = 1; i <= 10; i++)
        {
            if(i==5)
            {
                break;
            }
            System.out.print(i + "  ");
        }

        System.out.println("\n");

        // 📍 Break Statement with Labels
        aa:
        for (int i = 1; i <= 4; i++)
        {
            bb:
            for(int j=1; j<=4; j++)
            {
                if(i==2 && j==2)
                {
                    break aa;
                }
                System.out.println(i + "  " + j);
            }
        }
    }
}

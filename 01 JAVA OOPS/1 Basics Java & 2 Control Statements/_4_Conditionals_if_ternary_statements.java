// 📍 Conditionals: if-else and ternary_statements
public class _4_Conditionals_if_ternary_statements
{
    public static void main(String[] args)
    {
        // ✅ if statement
        var age=20;
        if(age>=18)
        {
            System.out.println("Your age is "+ age +",Hence you are allowed to Drive");
        }

        // ✅ if-else statement
        // 1.To check a number is even or odd
        var num = 5;
        if(num%2==0)
        {
            System.out.println(num + " is EVEN");
        }
        else
        {
            System.out.println(num + " is ODD");
        }

        // 2.Leap year: A year is leap if it is divisible by 4 and 400, but not 100
        var year = 2020;//it is a leap year
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
        {
            System.out.println(year + " is a LEAP YEAR");
        }
        else
        {
            System.out.println(year + " is NOT a LEAP YEAR");
        }

        // ✅ Ternary statement
        age = 21;
        String mssg = (age>18)?"Eligible":"Not Eligible";
        System.out.println(mssg);

        // ✅ if-else ladder statement
        var marks=90;
        if (marks>=90)
        {
            System.out.println("Distinction Grade");
        }
        else if(marks >= 40 && marks <= 90)
        {
            System.out.println("Average Grade");
        }
        else
        {
            System.out.println("Fail Grade");
        }

        // ✅ Nested if statement
        // try for yourself
    }
}

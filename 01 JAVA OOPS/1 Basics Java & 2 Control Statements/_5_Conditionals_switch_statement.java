// 📍 Conditionals: Switch statements

public class _5_Conditionals_switch_statement
{
    public static void main(String[] args)
    {
        // 🚀 3. MONTH CHECKER
        var month = 2;  //OR int month = 2;
        switch (month) 
        {
            case 1:
                System.out.println("1 - January");
                break;
            case 2:
                System.out.println("2 - February");
                break;
            case 3:
                System.out.println("1 - March");
                break;
            case 4:
                System.out.println("2 - April");
                break;
            case 5:
                System.out.println("1 - May");
                break;
            case 6:
                System.out.println("2 - June");
                break;
            default:
                System.out.println("Between July & December");
        }

        // OR Alternative Switch representation, break statements are included automatically
        // switch (month)
        // {
        //     case 1 -> System.out.println("1 - January");
        //     case 2 -> System.out.println("2 - February");
        //     case 3 -> System.out.println("1 - March");
        //     case 4 -> System.out.println("2 - April");
        //     case 5 -> System.out.println("1 - May");
        //     case 6 -> System.out.println("2 - June");
        //     default -> System.out.println("Between July & December");
        // }

        // 🚀 2. VOWEL OR CONSONENT
        var letter = 'o';  
        switch (letter) 
        {
            case 'a':
                System.out.println("1 - January");
                break;
            case 'e':
                System.out.println("2 - February");
                break;
            case 'i':
                System.out.println("1 - March");
                break;
            case 'o':
                System.out.println("2 - April");
                break;
            case 'u':
                System.out.println("1 - May");
                break;
            default:
                System.out.println("Consonent");
        }

        // OR Alternative Switch representation, break statements are included automatically
        // var letter = 'o';  
        // switch (letter) 
        // {
        //     case 'a' -> System.out.println("1 - January");
        //     case 'e' -> System.out.println("2 - February");
        //     case 'i' -> System.out.println("1 - March");
        //     case 'o' -> System.out.println("2 - April");
        //     case 'u' -> System.out.println("1 - May");
        //     default -> System.out.println("Consonent");
        // }

        // You can also have nested Switch statement 

    }
}

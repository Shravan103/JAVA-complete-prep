// 📍 ENUM: An enum (short for "enumeration") in Java is a special data type that represents a group of constants (unchanging values).
//          It is used when you have a fixed set of related values, like days of the week, directions, or types of planets.

public class _6_Enum
{
    public static void main(String[] args)
    {
        //1️⃣ Basics of enum:
        enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }
        Day today1 = Day.FRIDAY;
        System.out.println("Today is: " + today1 + "\n");

        //2️⃣ Looping Through Enum Values:
        // You can use the values() method to get all constants of an enum.
        for (Day today2 : Day.values())
        {
            System.out.println(today2);
        }
        System.out.println();
        
        // 3️⃣Enum in a Switch Case:
        enum Direction { NORTH, EAST, SOUTH, WEST }
        Direction dir = Direction.NORTH;
        switch (dir)
        {
            case NORTH -> System.out.println("Going North!");
            case EAST -> System.out.println("Going East!");
            case SOUTH -> System.out.println("Going South!");
            case WEST -> System.out.println("Going West!");
            default -> System.out.println("Unknown direction!");
        }

    }
}
// OUTPUT:
// Today is: FRIDAY

// MONDAY
// TUESDAY
// WEDNESDAY
// THURSDAY
// FRIDAY
// SATURDAY
// SUNDAY

// Going North!

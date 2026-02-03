package ENUM;

public class Day1 {
    public static void main(String[] args) {

            // printing names
        System.out.println(Day.MONDAY);

        // ordinal method that tells the order of list
        System.out.println(Day.MONDAY.ordinal());

        // Second method to do this
        Day monday = Day.MONDAY;
        System.out.println(monday.ordinal());

        // printing the lowercase of list names using names() method
        System.out.println(monday.name().toLowerCase());

        // also this can do this
        int ordinal = Day.MONDAY.ordinal();
        System.out.println(ordinal);

        // passing the string to check if that string is in enum list returning that string otherwise exception
        Day enumday = Day.valueOf("MONDAY");;
        System.out.println(enumday);

        // Exception comes
//        Day enumday2 = Day.valueOf("MONDaY");
//        System.out.println(enumday2);

            // printing all list with .values() method
        Day[] values = Day.values();
        for(Day i : values){
            System.out.println(i);
        }


    }
}

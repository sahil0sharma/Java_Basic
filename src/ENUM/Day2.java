package ENUM;

public class Day2 {
    public static void main(String[] args) {

        // displaying the method sayWeek that is in enum Day
        DayTwo monday = DayTwo.MONDAY;
        monday.sayWeek();

        // accessing second field "lower"
        System.out.println(DayTwo.MONDAY.lower);



    }
}

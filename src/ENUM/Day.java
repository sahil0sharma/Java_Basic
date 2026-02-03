package ENUM;

public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    // creating methods
    public void sayWeek(){
        System.out.println("Today is : " + this.name());
    }
}



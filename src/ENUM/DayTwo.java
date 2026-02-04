package ENUM;

public enum DayTwo {

    // setting the instance variable and can set multiple value
    SUNDAY("ravivar","sunday"),
    MONDAY("somwar","monday"),
    TUESDAY("mangalwar","tuesday"),
    WEDNESDAY("Budhwar", "wednesday"),
    THURSDAY("guruwar", " thrusday"),
    FRIDAY("shukrawar", "friday"),
    SATURDAY("shaniwar", "saturday");

    ///  making fields for instance variable
    final String hindi;
    final String lower;

    // setting with constructor for instances by fields
    DayTwo(String hindi, String lower){
        this.hindi = hindi;
        this.lower = lower;
    }

    // creating methods
    public void sayWeek(){
        System.out.println("Today is : " + this.name());
    }

}

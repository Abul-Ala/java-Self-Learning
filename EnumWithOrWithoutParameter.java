package DSAproblems;

/*The following code uses enums with or without parameter.
 In this code, I am  are trying to print some basic information about Weekdays .*/

enum WeekDays {

    // define group of Named constants

    SUNDAY("Sunday: rest your body", true),
    MONDAY("Monday: Chest Workout"),
    TUESDAY("Tuesday: legs Workout"),
    WEDNESDAY("Wednesday: rest Workout"),
    THURSDAY("Thursday: back Workout"),
    FRIDAY("Friday: shoulder Workout"),
    SATURDAY();

    // Private variable which hold information of the day
    private String dayInfo;

    // Private variable which hold the weekend is true or false
    private boolean isWeekend;

    //Constructor which will take single argument
    WeekDays(String dayInfo) {
        this.dayInfo = dayInfo;
    }
    //Constructor which will take two argument
    WeekDays( String dayInfo, boolean isWeekend) {
        this(dayInfo);
        this.isWeekend = isWeekend;
    }
    //Constructor
    WeekDays(){
        this.dayInfo ="Saturday: shoulder Workout";
    }

    // Getter method to get information of day
    public String getDayInfo() {
        return dayInfo;
    }
    //Getter method to get information of weekend
    public boolean isWeekend() {
        return isWeekend;
    }
}
public class EnumWithOrWithoutParameter {

    public static void main(String[] args) {
        // access enum constant
        WeekDays weekdays = WeekDays.SUNDAY;
        System.out.println(weekdays.getDayInfo());
        if (weekdays.isWeekend()) {
            restToday();
        } else {
            workToday(weekdays);
        }
    }
    private static void restToday() {
        System.out.println("Enjoy  It's Weekend");
    }
    private static void workToday(WeekDays weekdays) {
        System.out.println("Today is "+ weekdays+" Have to Hardwork ");
    }
}

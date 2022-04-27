package enums;

public enum DaysOfTheWeek {
    MONDAY(8.15,17.15),
    TUESDAY(8.15,17.15),
    WEDNESDAY(8.15,17.15),
    THURSDAY(8.15,17.15),
    FRIDAY(8.15,16.15),
    SATURDAY(0,0),
    SUNDAY(0,0);

    public double openingTime;
    public double closingTime;

    //Constructor
    DaysOfTheWeek(double openingTime,double closingTime){
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }
}

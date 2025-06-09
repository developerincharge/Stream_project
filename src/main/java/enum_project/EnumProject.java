package enum_project;

import java.util.Random;

public class EnumProject {

    public static void main(String[] args) {

        DayOfTheWeek weekDay = DayOfTheWeek.FRI;
       System.out.println(weekDay);
        switchDayOfWeek(weekDay);
        for (int i = 0; i < 10; i++) {
            weekDay = getRandomDay();
            //System.out.println(weekDay);

//            System.out.printf("Name is %s, Ordinal value is  =  %d%n", weekDay.name(), weekDay.ordinal());
//            if (weekDay == DayOfTheWeek.FRI){
//                System.out.println("It's Friday");
//            }
            switchDayOfWeek(weekDay);
        }
    }

    public static void switchDayOfWeek(DayOfTheWeek weekDay){

        int weekDayInteger = weekDay.ordinal() + 1;
        switch (weekDay) {
            case WED -> System.out.println("It's Wednesday  " + weekDayInteger);
            case SAT -> System.out.println("It's Saturday  " + weekDayInteger);
//            case SUN -> System.out.println("It's Sunday  " + weekDayInteger);
//            case MON -> System.out.println("It's Monday  " + weekDayInteger);

            default -> System.out.println(weekDay.name().charAt(0) + weekDay.name().substring(1).toLowerCase() + "day is Day " + weekDayInteger);
        }
    }




    public static DayOfTheWeek getRandomDay() {
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInteger];
    }
}

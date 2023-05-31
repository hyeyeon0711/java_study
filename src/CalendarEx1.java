package src;

import java.util.Calendar;

public class CalendarEx1 {
    public static void main(String args[]) {
        Calendar today = Calendar.getInstance();

        System.out.println("연도 : " + today.get(Calendar.YEAR));
        System.out.println("월  : " + (today.get(Calendar.MONTH)+1));
        System.out.println("일  : " + today.get(Calendar.DATE));
        System.out.println("시간(0-11) : " + today.get(Calendar.HOUR));
        System.out.println("시간(0-23) : " + today.get(Calendar.HOUR_OF_DAY));
        System.out.println("분(0-59)  : " + today.get(Calendar.MINUTE));
        System.out.println("초(0-59)  : " + today.get(Calendar.SECOND));
        System.out.println("TIMEZONE(-12~12) : " + (today.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
        System.out.println("이달의 마지막날 : " + today.getActualMaximum(Calendar.DATE));
    }
}

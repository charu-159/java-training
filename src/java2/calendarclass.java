package java2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class calendarclass {
    public static void main(String[] args) {
//        Calendar c=Calendar.getInstance();
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());


        Calendar c=Calendar.getInstance(TimeZone.getTimeZone(""));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        GregorianCalendar cal=new GregorianCalendar();
        System.out.println(cal.isLeapYear(2019));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);

        System.out.println(TimeZone.getDefault());
    }
}
//output =gregory it is a calendar which use in daily basis
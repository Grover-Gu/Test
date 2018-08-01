package test1.a;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestTime {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.HOUR));

        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(simpleDateFormat.format(calendar.getTime()));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DATE,-1);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.getTime());



        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd H:mm:dd");
        calendar = Calendar.getInstance();
        System.out.println(simpleDateFormat2.format(calendar.getTime()));
        calendar.add(Calendar.HOUR,1);
        Date date = new Date();
        System.out.println(simpleDateFormat2.format(calendar.getTime()));

    }
}

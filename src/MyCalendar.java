/**
 * Created by User on 17.11.2016.
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Месяц: " + calendar.get(Calendar.MONTH) + " Часы: " + calendar.get(Calendar.HOUR) + " Минуты: " + calendar.get(Calendar.MINUTE));
        for (int i = 0; i < 20; ++i) {
            calendar.set(Calendar.MONTH, i + 1);
            calendar.set(Calendar.HOUR, i + 3);
            calendar.set(Calendar.MINUTE, i + 20);
            System.out.println("Месяц: " + calendar.get(Calendar.MONTH) + " Часы: " + calendar.get(Calendar.HOUR) + " Минуты: " + calendar.get(Calendar.MINUTE));
        }
        // calendar.clear();
        //calendar = Calendar.getInstance();
        long time = 228228228228L;
        Date date = new Date(time);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        System.out.println("Год: " + simpleDateFormat.format(date));
        date.setTime(time + 228228228228L);
        simpleDateFormat.applyPattern("MMM");
        System.out.println("Месяц: " + simpleDateFormat.format(date));
        date.setTime(time + 228228228228L);
        simpleDateFormat.applyPattern("F");
        System.out.println("День недели в месяце без лидирующих нулей: " + simpleDateFormat.format(date));
        date.setTime(time + 228228228228L);
        simpleDateFormat.applyPattern("K");
        System.out.println("Количество часов в 12-часовом формате: " + simpleDateFormat.format(date));
        date.setTime(time + 228228228228L);
        simpleDateFormat.applyPattern("mm");
        System.out.println("Минуты с лидирующим нулем: " + simpleDateFormat.format(date));

    }
}

package homework.day8.dop;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class SledMes {

    public static int month1 = 8;

    public static void main(String[] args) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM");
        Calendar calendar = new GregorianCalendar(2017, month1, 25);
        calendar.roll(Calendar.MONTH, +1);
        System.out.println(dateFormat.format(calendar.getTime()));
    }

}

package homework.day6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class StringVivodData {

    public void vivodData() {
        //19 сентября, 2020, 3 часа 13 минут
        Date date = new Date();
        Locale ru = new Locale("ru");
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM, yyyy, K час(а)(ов) m минут(ы)", ru);
        System.out.println("Сейчас на дворе: " + formatter.format(date));

    }
}

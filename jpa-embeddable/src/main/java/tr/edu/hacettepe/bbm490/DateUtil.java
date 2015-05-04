package tr.edu.hacettepe.bbm490;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by mertcaliskan
 * on 11/01/15.
 */
public class DateUtil {

    public static Date now() {
        return new Date();
    }

    public static Date yesterday() {
        return addDay(now(), -1);
    }

    public static Date tomorrow() {
        return addDay(now(), +1);
    }

    public static Date addDay(Date date, int day) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.add(Calendar.DAY_OF_MONTH, day);

        return instance.getTime();
    }
}

import java.time.*;
import java.util.*;

public class clock{
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        int sec=time.getSecond();
        int min=time.getMinute();
        int hour=time.getHour();
        System.out.println(hour+":"+min+":"+sec);

        LocalDate date=LocalDate.now();
        int month=date.getMonthValue();
        int d=date.getDayOfMonth();
        System.out.println("2026"+" - "+month+" - "+d);
        System.out.println(date.getDayOfWeek());

    }
}

 

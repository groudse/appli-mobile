import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class DifferenceBetweenDate {

    public static Duration durationBetweenTime(LocalTime localTime1, LocalTime localTime2) {
       
    
       Duration dd = Duration.between(localTime1,localTime2);
       return dd;
    }

    public static Period periodBetweenDate(LocalDate date1, LocalDate date2) {
        Period difference = Period.between(date1, date2);
        return difference;
    }


    public static Long numberOfHoursBetweenDateTime(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        Duration difference = Duration.between(dateTime1, dateTime2);
        
        long p = difference.toHours();
        return p;
    }

}
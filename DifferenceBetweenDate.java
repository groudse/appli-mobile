import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class DifferenceBetweenDate {

    public static Duration durationBetweenTime(LocalTime localTime1, LocalTime localTime2) {
       
        if(localTime1 != null && localTime2 != null){
       Duration dd = Duration.between(localTime1,localTime2);
       return dd;
    }else{
        return null;
    }
}

    public static Period periodBetweenDate(LocalDate date1, LocalDate date2) {
        
        if(date1 != null && date2 != null){

        Period difference = Period.between(date1, date2);
       
       
        return difference;

         } else{
            return null;
        }
    }

    public static Long numberOfHoursBetweenDateTime(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        
        if(dateTime1 != null && dateTime2 != null){
            Duration difference = Duration.between(dateTime1, dateTime2);
            if(difference.toHours() > 0){
        
           long p = difference.toHours();
        return p;
    }else{
        Duration difference2 = Duration.between(dateTime2, dateTime1);
        long p = difference2.toHours();
        return p;
    }}else{
        return null;
    }


}
}
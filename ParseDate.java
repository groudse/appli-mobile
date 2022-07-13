import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.text.DateFormat;
import java.util.Locale;


public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        LocalDateTime parseIt = LocalDateTime.parse(stringDate);
        return parseIt;
    }

  public static LocalDate parseFullTextFormat(String stringDate) {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", Locale.FRANCE);
    LocalDate dt = LocalDate.from(formatter.parse(stringDate));
    return dt;

    }

 
    public static LocalTime parseTimeFormat(String stringDate) {
        
        
    //09 heures du soir, 07 minutes et 23 secondes
    //H +"heures"+ B, m +"minutes et"+ s +"secondes" "
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh 'heures' B, mm 'minutes et' ss 'secondes'", Locale.FRANCE);
    LocalTime dt = LocalTime.from(formatter.parse(stringDate));
    return dt;



    }

}

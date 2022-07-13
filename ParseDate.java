import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.text.DateFormat;
import java.util.Locale;


public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        if(!stringDate == null){
        LocalDateTime parseIt = LocalDateTime.parse(stringDate);
        return parseIt;
    }else{
        return null;
    }

  public static LocalDate parseFullTextFormat(String stringDate) {
    if(!stringDate == null){
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", Locale.FRANCE);
    LocalDate dt = LocalDate.from(formatter.parse(stringDate));
    return dt;

    }else{
        return null;
    }
  }

 
    public static LocalTime parseTimeFormat(String stringDate) {
        
        
    
    if(!stringDate == null){
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh 'heures' B, mm 'minutes et' ss 'secondes'", Locale.FRANCE);
    LocalTime dt = LocalTime.from(formatter.parse(stringDate));
    return dt;



    }else{
        return null;
    }
    }

}

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale; 
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;


public class FormatDate {

    public static String formatToFullText(LocalDateTime dateTime) {
       
       
       
     
    
       if(dateTime != null){
        String test = dateTime.toString();
       int pp = test.length();
        
        if(pp==19){
       String dateString = dateTime.toString();
       DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
       DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("'Le' dd MMM'.' 'de l''an' yyyy 'à' HH'h'mm'm et' ss's'", Locale.FRANCE);
       LocalDateTime dateT = LocalDateTime.parse(dateString, formatter1);
       String sortie = formatter2.format(dateT);
       return sortie;
        }else{
            String dateString = dateTime.toString();
       DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.nn");
       DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("'Le' dd MMM 'de l''an' yyyy 'à' HH'h'mm'm et' ss's'", Locale.FRANCE);
       LocalDateTime dateT = LocalDateTime.parse(dateString, formatter1);
       String sortie = formatter2.format(dateT);
       return sortie;
            
        }}else{return null;
        }
    }

    public static String formatSimple(LocalDate date) {
        
        if(date != null){
        String dateString = date.toString();
       DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
       DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MMMM dd yy", Locale.ITALIAN);
       LocalDate dateT = LocalDate.parse(dateString, formatter1);
       String sortie = formatter2.format(dateT);
       return sortie;

        }else{
            return null;
        }
    }

    public static String formatIso(LocalTime time) {
       
        
        if(time != null){
           return time.toString();
        }else{
            return null;
        }
    }

}




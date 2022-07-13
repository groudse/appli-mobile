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
       String dateString = dateTime.toString();
       DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
       DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("'Le' dd MMMM 'de l''an' yyyy 'à' HH'h'mm'm et' ss's'");
       LocalDateTime dateT = LocalDateTime.parse(dateString, formatter1);
       String sortie = formatter2.format(dateT);
       return sortie;
        }else{
            return null;
        }
    }

    public static String formatSimple(LocalDate date) {
        return date;
        
    }

    public static String formatIso(LocalTime time) {
        return time;
    }

}




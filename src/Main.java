
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;



public class Main {

    public static void main(String[] args) {

        Datehandler datehandler = new Datehandler();

        System.out.println(datehandler.get_unix_timestamp("2013_05_31"));
        datehandler.string_splitter("2013_05_30");
        System.out.println(datehandler.day);
        System.out.println(datehandler.year);
    }

}


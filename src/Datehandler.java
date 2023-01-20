

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;

public class Datehandler {
   public int year, month, day;


    public void string_splitter(String str){
        String[] split = str.split("_");
        this.year = Integer.parseInt(split[0]);
        this.month = Integer.parseInt(split[1]);
        this.day = Integer.parseInt(split[2]);

    }
    public long get_unix_timestamp(String str) {
        string_splitter(str);
        // Get LocalDate object
        LocalDate localDate = LocalDate.of(this.year, this.month, this.day);

        // Convert LocalDate to Instant with ZoneOffSet
        Instant instant = localDate.atStartOfDay().toInstant(ZoneOffset.UTC);

        // Get unix timestamp from Instant
        long epochSecond = instant.getEpochSecond();
        //System.out.println("Unix timestamp: " + epochSecond);

        return epochSecond;
    }

}

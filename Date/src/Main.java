import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args){

        ZonedDateTime myDate = OffsetDateTime.parse("2002-03-01T13:00:00Z").atZoneSameInstant(ZoneId.of("Europe/Rome"));


        String data = myDate.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        System.out.println(data);
        String data2 = myDate.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println(data2);
        String data3 = myDate.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
        System.out.println(data3);
    }
}

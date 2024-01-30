import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args){

        OffsetDateTime myDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        myDate = myDate.plusYears(1);
        myDate = myDate.plusMonths(1);
        myDate = myDate.plusDays(7);
        String formatDate = myDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println(formatDate);
    }
}

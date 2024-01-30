import java.text.Format;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){

        OffsetDateTime myDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String formatDate = myDate.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        System.out.println(formatDate);
    }
}

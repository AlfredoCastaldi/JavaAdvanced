import java.text.Format;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {

        DateParser data1 = new DateParser("2020-05-30T00:00:00Z");
        for (String element : data1.defaultFormat()){
            System.out.println(element);
        }
        DateParser data2 = new DateParser("2023-03-01T13:00:00Z");
        System.out.println(data2.defaultFormat()[1]);
        DateParser data3 = new DateParser("2023-03-01T13:00:00Z");
        System.out.println(data3.getYearMonthDay());
        System.out.println(data3.getDate());
        data3.addNewDate(1,1,7);
        System.out.println(data3.getDate());


    }
}


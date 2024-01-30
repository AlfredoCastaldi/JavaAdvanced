import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args){

        OffsetDateTime myDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int formatDateYear = myDate.getYear();
        System.out.println(formatDateYear);
        int formatDateMonth = myDate.getMonthValue();
        System.out.println(formatDateMonth);
        int formatDateDay = myDate.getDayOfMonth();
        System.out.println(formatDateDay);
        String formatDateWeekDay = myDate.getDayOfWeek().toString();
        System.out.println(formatDateWeekDay);
    }
}

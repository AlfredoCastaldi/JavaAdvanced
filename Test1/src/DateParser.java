import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;

public class DateParser{
    private OffsetDateTime date;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("eeee dd MMMM yyyy");
    private String stringDate;
    public String[] defaultStringDates = new String[3];


    public DateParser(String data){
        this.date =  OffsetDateTime.parse(data);
        setStringDate(this.date);
    }
    public void addNewDate(int months, int years, int days){
        this.date = this.date.plusDays(days);
        this.date = this.date.plusYears(years);
        this.date = this.date.minusMonths(months);
    }

    public void addDays(int days) throws ArithmeticException{
        if (days > 0){
        OffsetDateTime newDate = this.date.plusDays(days);
        this.date = newDate;
        setStringDate(this.date);
        } else {
            throw new ArithmeticException("inserire numero maggiore di 0");
        }
    }
    public String[] defaultFormat(){
        DateTimeFormatter fullFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        defaultStringDates[0] = this.date.format(fullFormatter);
        defaultStringDates[1] = this.date.format(mediumFormatter);
        defaultStringDates[2] = this.date.format(shortFormatter);
        return this.defaultStringDates;
    }
    public String getYearMonthDay(){
        StringBuilder result = new StringBuilder();
        result.append(this.date.getDayOfMonth());
        result.append(" ");
        result.append(this.date.getDayOfWeek());
        result.append(" ");
        result.append(this.date.getMonth());
        result.append(" ");
        result.append(this.date.getYear());
        return result.toString();

    }
    public OffsetDateTime getDate() {
        return date;
    }
    public String getStringDate() {return stringDate;}
    public void setStringDate(OffsetDateTime date){
       this.stringDate = date.format(this.formatter);
    }
    public String compareDates(OffsetDateTime date) throws DateTimeParseException {

    String result = null;
        try {
    if (date == null){
        throw new DateTimeParseException("invalid date format", " ", 0);
    }

        if (this.date.isAfter(date)){
            result =  this.date + " is after " + date;
        } else if (this.date.isBefore(date)){
            result =  this.date + " is before " + date;
        } else if (this.date.isEqual(date)){
            result =  this.date + " is equal " + date;
        } else {
            throw new NullPointerException("comparing with wrong type of data");
        }
    } catch (NullPointerException e){
        System.out.println(e);
    } catch (DateTimeParseException e){
            System.out.println(e);}
        return result;
    }
}
import com.sun.jdi.connect.Connector;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert.*;
import org.junit.rules.ExpectedException;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;

public class DateParserTest {
    @Test
    public void dateChangedRight(){
        DateParser date = new DateParser("2023-03-01T13:00:00Z");
        date.addNewDate(1,1,7);
        Assert.assertEquals(OffsetDateTime.parse("2024-02-08T13:00Z"), date.getDate());
    }
    @Test
    public void checkYearMonthDay(){
        DateParser date = new DateParser("2023-03-01T13:00:00Z");
        Assert.assertEquals("1 WEDNESDAY MARCH 2023", date.getYearMonthDay());
    }
    @Test
    public void defaultFormatWorks(){
        DateParser date = new DateParser("2020-05-30T00:00:00Z");
        Assert.assertEquals("FULL format should be sabato 30 maggio 2020", "sabato 30 maggio 2020",date.defaultFormat()[0]);
        Assert.assertEquals("MEDIUM should be 30 mag 2020", "30 mag 2020", date.defaultFormat()[1]);
        Assert.assertEquals("SHORT 30/05/20","30/05/20", date.defaultFormat()[2]);
    }
    @Test
    public void defaultFormat2ShouldBeMedium(){
        DateParser data2 = new DateParser("2023-03-01T13:00:00Z");
        Assert.assertEquals("medium format should be 1 mar 2023", "1 mar 2023", data2.defaultFormat()[1]);
    }


    @Test
    public void dateShouldBe6AfterSevenDays(){
     DateParser date = new DateParser("2020-05-30T00:00:00Z");
     date.addDays(7);
     Assert.assertEquals(6, date.getDate().getDayOfMonth());
    }
    @Test (expected = Exception.class)
    public void dateIsNull() throws ArithmeticException{
        DateParser date = new DateParser("2020-05-31T00:00:00Z");
        date.addDays(0);}
    @Test
    public void dateIsComparedCorrectly(){
        DateParser date = new DateParser("2020-02-22T00:00:00Z");
        DateParser date2 = new DateParser("2020-05-23T00:00:00Z");
        Assert.assertEquals("2020-02-22T00:00Z is before 2020-05-23T00:00Z", date.compareDates(date2.getDate()));
        DateParser date3 = new DateParser("2020-07-22T00:00:00Z");
        DateParser date4 = new DateParser("2020-05-23T00:00:00Z");
        Assert.assertEquals("2020-07-22T00:00Z is after 2020-05-23T00:00Z", date3.compareDates(date4.getDate()));
        DateParser date5 = new DateParser("2020-05-23T00:00:00Z");
        DateParser date6 = new DateParser("2020-05-23T00:00:00Z");
        Assert.assertEquals("2020-05-23T00:00Z is equal 2020-05-23T00:00Z", date5.compareDates(date6.getDate()));
    }
    @Test (expected = DateTimeParseException.class)
    public void nullDateShouldBeCaught() throws DateTimeParseException {
        DateParser date = new DateParser("2020-02-22T00:00:00Z");
        DateParser date2 = new DateParser("");
        date.compareDates(date2.getDate());
    }
}






package pe.edu.galaxy.training.java.library.utils.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public interface DateUtilWrapper {

    LocalDate parseDate(String text);
    LocalDate parseDate(String text, String pattern);

    LocalDateTime parseDateTime(String text);
    LocalDateTime parseDateTime(String text, String pattern);

    String format(LocalDate date);
    String format(LocalDate date, String pattern);

    String format(LocalDateTime dateTime);
    String format(LocalDateTime dateTime, String pattern);

    String ISO_DATE = "yyyy-MM-dd";
    String ISO_DATE_TIME = "yyyy-MM-dd'T'HH:mm:ss";

}

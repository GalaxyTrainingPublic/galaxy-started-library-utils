package pe.edu.galaxy.training.java.library.utils.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateUtilWrapperImpl implements DateUtilWrapper{

    @Override
    public LocalDate parseDate(String text) {
        return DateParserUtils.parseToLocalDate(text,ISO_DATE);
    }

    @Override
    public LocalDate parseDate(String text, String pattern) {
        return DateParserUtils.parseToLocalDate(text,pattern);
    }

    @Override
    public LocalDateTime parseDateTime(String text) {
        return DateParserUtils.parseToLocalDateTime(text,ISO_DATE_TIME);
    }

    @Override
    public LocalDateTime parseDateTime(String text, String pattern) {
        return DateParserUtils.parseToLocalDateTime(text,pattern);
    }

    @Override
    public String format(LocalDate date) {
        return DateFormatUtils.format(date);
    }

    @Override
    public String format(LocalDate date, String pattern) {
        return DateFormatUtils.format(date, pattern);
    }

    @Override
    public String format(LocalDateTime dateTime) {
        return DateFormatUtils.format(dateTime);
    }

    @Override
    public String format(LocalDateTime dateTime, String pattern) {
        return DateFormatUtils.format(dateTime, pattern);
    }
}

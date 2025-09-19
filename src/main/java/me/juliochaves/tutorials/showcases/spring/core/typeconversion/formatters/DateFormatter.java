package me.juliochaves.tutorials.showcases.spring.core.typeconversion.formatters;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.Formatter;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

public class DateFormatter implements Formatter<Date> {
	private String pattern;

	public DateFormatter(String pattern) {
		this.pattern = pattern;
	}

	@NonNull
	public String print(@Nullable Date date, @NonNull Locale locale) {
		if (date == null) {
			return "";
		}
		return getDateFormat(locale).format(date);
	}

	@Nullable
	public Date parse(@NonNull String formatted, @NonNull Locale locale) throws ParseException {
		if (formatted.length() == 0) {
			return null;
		}
		return getDateFormat(locale).parse(formatted);
	}

	protected DateFormat getDateFormat(Locale locale) {
		DateFormat dateFormat = new SimpleDateFormat(this.pattern, locale);
		dateFormat.setLenient(false);
		return dateFormat;
	}

}

package me.juliochaves.tutorials.showcases.spring.core.binding.propertyeditors.editors;

import java.beans.PropertyEditorSupport;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateEditor extends PropertyEditorSupport{
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			setValue(format.parse(text));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}

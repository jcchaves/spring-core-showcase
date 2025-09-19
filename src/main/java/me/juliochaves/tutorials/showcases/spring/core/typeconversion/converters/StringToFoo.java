package me.juliochaves.tutorials.showcases.spring.core.typeconversion.converters;

import me.juliochaves.tutorials.showcases.spring.core.typeconversion.beans.Foo;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;

public class StringToFoo implements Converter<String, Foo> {
	@Override
	public Foo convert(@NonNull String text) {
		return new Foo(text);
	}
}

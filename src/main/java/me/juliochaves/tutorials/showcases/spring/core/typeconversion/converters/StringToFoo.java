package me.juliochaves.tutorials.showcases.spring.core.typeconversion.converters;

import me.juliochaves.tutorials.showcases.spring.core.typeconversion.beans.Foo;
import org.springframework.core.convert.converter.Converter;

public class StringToFoo implements Converter<String, Foo> {
	@Override
	public Foo convert(String text) {
		return new Foo(text);
	}
}

package me.juliochaves.tutorials.showcases.spring.core.di.componentscanning.beans;

import org.springframework.stereotype.Component;

@Component
public class Bar {
	@Override
	public String toString() {
		return "This is a bar";
	}
}

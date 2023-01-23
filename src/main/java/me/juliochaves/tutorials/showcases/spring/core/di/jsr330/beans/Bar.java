package me.juliochaves.tutorials.showcases.spring.core.di.jsr330.beans;

import javax.inject.Named;

@Named("bar")
public class Bar {
	@Override
	public String toString() {
		return "This is a bar";
	}
}

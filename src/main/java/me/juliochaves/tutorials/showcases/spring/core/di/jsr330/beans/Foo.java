package me.juliochaves.tutorials.showcases.spring.core.di.jsr330.beans;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class Foo {

	@Inject
	private Bar bar;

	public Bar getBar() {
		return bar;
	}

	public void setBar(Bar bar) {
		this.bar = bar;
	}
}

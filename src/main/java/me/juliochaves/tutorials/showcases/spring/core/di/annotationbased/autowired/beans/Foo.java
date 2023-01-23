package me.juliochaves.tutorials.showcases.spring.core.di.annotationbased.autowired.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Foo {
	private Bar bar;

	public Bar getBar() {
		return bar;
	}

	@Autowired
	public void setBar(Bar bar) {
		this.bar = bar;
	}
}

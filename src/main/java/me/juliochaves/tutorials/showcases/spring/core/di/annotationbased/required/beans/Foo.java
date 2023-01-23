package me.juliochaves.tutorials.showcases.spring.core.di.annotationbased.required.beans;

public class Foo {
	private Bar bar;

	public Foo(Bar bar) {
		this.bar = bar;
	}

	public Bar getBar() {
		return bar;
	}

	public void setBar(Bar bar) {
		this.bar = bar;
	}
}

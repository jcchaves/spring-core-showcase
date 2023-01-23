package me.juliochaves.tutorials.showcases.spring.core.di.cnamespace.beans;

import java.beans.ConstructorProperties;

public class Foo {
	private Bar bar;
	private Baz baz;

	@ConstructorProperties({ "bar", "baz" })
	public Foo(Bar bar, Baz baz) {
		this.bar = bar;
		this.baz = baz;
	}

}

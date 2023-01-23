package me.juliochaves.tutorials.showcases.spring.core.di.annotationbased.resource.beans;

import javax.annotation.Resource;

public class Foo {
	private Baz baz;

	@Resource(name = "mildBar")
	private Bar mildBar;

	public Baz getBaz() {
		return baz;
	}

	@Resource
	public void setBaz(Baz baz) {
		this.baz = baz;
	}

	public Bar getMildBar() {
		return mildBar;
	}

	public void setMildBar(Bar mildBar) {
		this.mildBar = mildBar;
	}
}

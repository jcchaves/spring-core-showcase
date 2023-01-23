package me.juliochaves.tutorials.showcases.spring.core.binding.beanwrapper.beans;

public class Foo {
	private Bar bar;

	public Bar getBar() {
		return bar;
	}

	public void setBar(Bar bar) {
		this.bar = bar;
	}

	@Override
	public String toString() {
		return "This is a foo";
	}
}

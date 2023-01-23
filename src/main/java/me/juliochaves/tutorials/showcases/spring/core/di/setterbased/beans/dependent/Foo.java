package me.juliochaves.tutorials.showcases.spring.core.di.setterbased.beans.dependent;

import me.juliochaves.tutorials.showcases.spring.core.di.setterbased.beans.dependencies.Bar;
import me.juliochaves.tutorials.showcases.spring.core.di.setterbased.beans.dependencies.Baz;

public class Foo {
	private Bar bar;
	private Baz baz;

	public Foo() {
	}

	public Bar getBar() {
		return bar;
	}

	public void setBar(Bar bar) {
		this.bar = bar;
	}

	public Baz getBaz() {
		return baz;
	}

	public void setBaz(Baz baz) {
		this.baz = baz;
	}
}

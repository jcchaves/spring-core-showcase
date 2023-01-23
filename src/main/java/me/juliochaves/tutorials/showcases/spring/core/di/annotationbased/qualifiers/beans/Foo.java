package me.juliochaves.tutorials.showcases.spring.core.di.annotationbased.qualifiers.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import me.juliochaves.tutorials.showcases.spring.core.di.annotationbased.qualifiers.custom.Kind;

public class Foo {
	private Bar bar;

	@Autowired
	@Qualifier("mild")
	private List<Bar> mildBars;

	@Autowired
	@Kind("severe")
	private Bar severeBar;

	public Bar getBar() {
		return bar;
	}

	@Autowired
	@Qualifier("extreme")
	public void setBar(Bar bar) {
		this.bar = bar;
	}

	public List<Bar> getMildBars() {
		return mildBars;
	}

	public void setMildBars(List<Bar> mildBars) {
		this.mildBars = mildBars;
	}

	public Bar getSevereBar() {
		return severeBar;
	}

	public void setSevereBar(Bar severeBar) {
		this.severeBar = severeBar;
	}
}

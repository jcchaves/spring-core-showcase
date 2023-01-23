package me.juliochaves.tutorials.showcases.spring.core.di.beanmetadata.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Foo {

	@Autowired
	@Qualifier("normal")
	private Bar bar;

	@Autowired
	@Qualifier("extreme")
	private Bar extremeBar;

	public Bar getBar() {
		return bar;
	}

	public void setBar(Bar bar) {
		this.bar = bar;
	}

	public Bar getExtremeBar() {
		return extremeBar;
	}

	public void setExtremeBar(Bar extremeBar) {
		this.extremeBar = extremeBar;
	}
}

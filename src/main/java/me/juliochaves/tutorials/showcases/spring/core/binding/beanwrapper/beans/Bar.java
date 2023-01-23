package me.juliochaves.tutorials.showcases.spring.core.binding.beanwrapper.beans;

public class Bar {
	private String kind;

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return String.format("This is a %s bar", kind);
	}
}

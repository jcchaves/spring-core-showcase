package me.juliochaves.tutorials.showcases.spring.core.di.annotationbased.qualifiers.beans;

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
		return String.format("This bar is %s", kind);
	}
}

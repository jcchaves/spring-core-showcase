package me.juliochaves.tutorials.showcases.spring.core.resources.dependencies.beans;

import org.springframework.core.io.Resource;

public class Foo {
	private Resource resources;

	public Resource getResources() {
		return resources;
	}

	public void setResources(Resource resources) {
		this.resources = resources;
	}
}

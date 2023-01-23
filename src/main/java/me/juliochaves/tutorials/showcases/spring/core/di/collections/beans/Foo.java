package me.juliochaves.tutorials.showcases.spring.core.di.collections.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Foo {
	private List<String> list;
	private Map<String, String> map;
	private Properties props;
	private Set<String> set;
	private Map<String, Float> strongTypedMap;

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Map<String, Float> getStrongTypedMap() {
		return strongTypedMap;
	}

	public void setStrongTypedMap(Map<String, Float> strongTypedMap) {
		this.strongTypedMap = strongTypedMap;
	}
}

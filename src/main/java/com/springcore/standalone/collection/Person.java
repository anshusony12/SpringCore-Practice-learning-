package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> friends;
	private Map<String, Integer> frameworks;
	private Properties properties;
	
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Map<String, Integer> getFrameworks() {
		return frameworks;
	}
	public void setFrameworks(Map<String, Integer> frameworks) {
		this.frameworks = frameworks;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "Person [friends=" + friends + ", frameworks=" + frameworks + ", properties=" + properties + "]";
	}
	
	
}

package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certi certi;
	private List<String> li;
	
	public Person(String name, int personId,Certi certi, List<String> li) {
		this.name=name;
		this.personId=personId;
		this.certi=certi;
		this.li=li;
		
	}

	@Override
	public String toString() {
		return this.name+"  "+ this.personId +"{"+this.certi.name+"}" +"studied in "+this.li;
	}
	
	
}

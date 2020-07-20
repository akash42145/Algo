package com.example.algoexpert.graph.lcm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {
	
	private char name;
	private List<Employee> directReportees;
	
	public Employee(char name) {
		this.name = name;
		this.directReportees = new ArrayList<Employee>();
		
	}
	
	public char getName() {
		return name;
	}

	public void setName(char name) {
		this.name = name;
	}

	public List<Employee> getDirectReportees() {
		return Collections.unmodifiableList(directReportees);
	}	

	public void addReportees(Employee [] reports) {
		for(Employee report : reports) {
			this.directReportees.add(report);
		}
	}

}

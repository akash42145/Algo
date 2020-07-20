package com.example.algoexpert.graph.lcm;

import java.util.ArrayList;
import java.util.List;

public class EmployeesRelationInfo {
	
	private int noOfSelectedReportees;
	private Employee reportOne;
	private Employee reportTwo;
	private Employee lowerestCommonManage;
	private List<Employee> commonManagers = new ArrayList<>();;
	
	public EmployeesRelationInfo() {
		
	}
	
	public EmployeesRelationInfo(int noOfSelectedReportees, Employee commonManage) {
		this.noOfSelectedReportees = noOfSelectedReportees;	
		this.lowerestCommonManage = commonManage;
		commonManagers.add(lowerestCommonManage);
		
	}

	public int getNoOfSelectedReportees() {
		return noOfSelectedReportees;
	}

	public void setNoOfSelectedReportees(int noOfSelectedReportees) {
		this.noOfSelectedReportees = noOfSelectedReportees;
	}

	public Employee getReportOne() {
		return reportOne;
	}

	public void setReportOne(Employee reportOne) {
		this.reportOne = reportOne;
	}

	public Employee getReportTwo() {
		return reportTwo;
	}

	public void setReportTwo(Employee reportTwo) {
		this.reportTwo = reportTwo;
	}

	public Employee getLowerestCommonManage() {
		return lowerestCommonManage;
	}

	public void setLowerestCommonManage(Employee lowerestCommonManage) {
		this.lowerestCommonManage = lowerestCommonManage;
	}
	
	

}

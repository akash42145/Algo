package com.example.algoexpert.graph.lcm;


/*
 * 
 * Find the lower common manager in org chart
 * 
 *                 A
 *                 
 *             /   |  \
 *           B     C    J 
 *          / \    /\
 *         D   E  F  G
 *       /  \
 *      H     I
 *           /  \
 *         K     L
 *              /  \
 *             M    N 
 *               
 *      I/P = Report 1 : E, Report 2 : I , Top Manager : A
 *      O/P = Lower Common manager = B
 *      
 *      I/P = Report 1 : E, Report 2 : M , Top Manager : K
 *      O/P = Lower Common manager = I
 */

public class LowestCommonManager {

	public static void main(String[] args) {
		 Employee top = buildEmployeeHirercy();
		 
		 Employee reportOne = new Employee('E');
		 Employee reportTwo = new Employee('I');
		  
		 EmployeesRelationInfo empInfo = getEmpRelationInfo(top, reportOne, reportTwo);
		 
		 System.out.println(empInfo.getLowerestCommonManage().getName());

	}

	private static EmployeesRelationInfo getEmpRelationInfo(Employee top, Employee reportOne, Employee reportTwo) {
		
		int noOfReports = 0;
		
		for(Employee reportee : top.getDirectReportees()) {
			
			EmployeesRelationInfo empInfo = getEmpRelationInfo(reportee, reportOne, reportTwo);
			
			if(empInfo.getNoOfSelectedReportees() == 2) {
				return empInfo;
			}
			noOfReports += empInfo.getNoOfSelectedReportees();
		}
		
		if(top.getName() == reportOne.getName() || top.getName() == reportTwo.getName()) {
			noOfReports ++;
		}
		
		Employee commonManager = noOfReports == 2 ? top : null;
		
		
		return new EmployeesRelationInfo(noOfReports, commonManager);
	}

	private static Employee buildEmployeeHirercy() {
		Employee top = new Employee('A');		
		Employee B = new Employee('B');
		Employee C = new Employee('C');
		Employee J = new Employee('J');
		Employee D = new Employee('D');
		Employee E = new Employee('E');
		Employee F = new Employee('F');
		Employee G = new Employee('G');
		Employee H = new Employee('H');
		Employee I = new Employee('I');
		
		top.addReportees(new Employee[] {B, C, J});
		B.addReportees(new Employee[] {D, E});
		C.addReportees(new Employee[] {F,G});
		D.addReportees(new Employee[] {H, I});
		
		
		
		
		return top;
	}

}

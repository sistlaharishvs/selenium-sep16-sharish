package org.student;

import org.department.Department;

public class Student extends Department 

{
	
	
	
	public void studentName() 
	{
		System.out.println("studentName");

	}
	
	public void studentDept() 
	{
		System.out.println("studentDept");

	}
	
	public void studentId() 
	{
	  System.out.println("studentId");	

	}
	
	public static void main(String[] args) 
	
	{
		
		Student object = new Student();
		
		object.collegeCode();
		object.collegeName();
		object.collegeRank();
		object.deptName();
		object.studentDept();
		object.studentId();
		object.studentName();
		
	}
	

}

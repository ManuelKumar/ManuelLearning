package com.javatpoint.controllers;

public class Emp {

	int empid;
	String name;
	String salary;
	String designation;

	public Emp() {
	}
	
	public Emp(int i, String string, float f, String string2) {
		this.empid=1;
		this.name="Kana";
		this.salary="1111";
		this.designation="Mgr";
		this.empid=2;
		this.name="Bana";
		this.salary="2222";
		this.designation="SMgr";
		this.empid=3;
		this.name="Sana";
		this.salary="3333";
		this.designation="Prof";
		
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}




	public String getSalary() {
		return salary;
	}




	public void setSalary(String salary) {
		this.salary = salary;
	}




	public String getDesignation() {
		return designation;
	}




	public void setDesignation(String designation) {
		this.designation = designation;
	}



}

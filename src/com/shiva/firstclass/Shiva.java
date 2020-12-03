package com.shiva.firstclass;

public class Shiva {
	int salary=20000;
	public int increaseSalary(){
		salary=salary+60000;
		return salary;
		
	}
	public static void main(String[] args) {
		Shiva object=new Shiva();
		int salary=object.increaseSalary();
		System.out.println(salary);
		int salaryTwo=object.increaseSalary();
		System.out.println(salaryTwo);
	}

}

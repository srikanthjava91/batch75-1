package com.javaintro;

public class Employee {

	int eid;
	String name;

	static int orgId;
	static String orgName;

	public static void main(String[] args) {
		System.out.println("main method started from Employee !");

		Employee e1 = new Employee();

		System.out.println("-------Accessing static data ");
		System.out.println(orgId);//Accessing directly 
		System.out.println(orgName);

		System.out.println(Employee.orgId);//Accessing by using class name 
		System.out.println(Employee.orgName);

		System.out.println(e1.orgId);//Accessing by using Object reference variable 
		System.out.println(e1.orgName);

		System.out.println("--------Accessing instance data ------------");
		System.out.println("---------Only we can access through Obj Ref var------------");
		System.out.println(e1.eid);
		System.out.println(e1.name);

	}

}

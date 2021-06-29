package org.sample;

public class SchoolDetails implements Student, School{

	@Override  
	public void studentId() { 
		System.out.println("Student Id : 23456");
	}

	@Override
	public void stuudentName(String name) {
		System.out.println("Student Name : "+name);
	}
	
	@Override
	public void schoolName() {
		System.out.println("School Name : Velammal");
	}

	@Override
	public void schoolAddress() {
		System.out.println("School Address : Chennai");
	}
	
	public static void main(String[] args) {
		
		SchoolDetails s = new SchoolDetails();
		s.studentId();
		s.stuudentName("Vimal");
		s.schoolAddress();
		s.schoolName();
	}
	
}
 
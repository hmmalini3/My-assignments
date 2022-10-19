package Org.student;

import Org.department.Department;

public class Student extends Department {
	
	public void studentName() {
	
		System.out.println("Student name is Malini");
	}
	public void studentDept() {
	
		System.out.println("Student dept CS");
	}
	
	public void studentId() {
	
		System.out.println("Id 3035");
	
	}
				
    public static void main(String[] args) {
		Student s= new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.depName();
		s.studentName();
		s.studentId();
		s.studentDept();
	}
}

 

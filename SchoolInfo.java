package com.wipro.variables;

public class SchoolInfo {
	int stuId = 3702;
    	String name = "Shubha";
	static int stuMarks = 100;
	static String schoolName = "Harrison Education";
	static int schoolId = 9308;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchoolInfo info = new SchoolInfo();
		String s = info.name;
		System.out.println("Name of the student: "+ s);
		
		int id = info.stuId;
		System.out.println("Student Id: "+id);
		
		System.out.println("Student Marks: " + SchoolInfo.stuMarks);
		System.out.println("School Name: " + SchoolInfo.schoolName);
		System.out.println("School Info: " + SchoolInfo.schoolId);
		

	}

}

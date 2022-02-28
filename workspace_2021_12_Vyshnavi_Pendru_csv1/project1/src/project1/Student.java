package project1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student extends Person implements Comparable<Student> {

	private int studentID;
	private double gpa;

	public Student(int iD, int age, String fName, String lName, String parentFName, String parentLName) {
		super(iD, age, fName, lName, parentFName, parentLName);
		// TODO Auto-generated constructor stub
	}

	public Student(int iD, int age, String fName, String lName, String parentFName, String parentLName, int studentID,
			double gpa) {
		super(iD, age, fName, lName, parentFName, parentLName);
		this.studentID = studentID;
		this.gpa = gpa;
	}

	public Student() {
		super();// TODO Auto-generated constructor stub
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public List<Student> sortStudent(List<Student> students) {
		List<Student> allStudentsSorted= new ArrayList<>();
		String label="Id\tAge\tFirst Name\tLast Name\t\tParent First Name\t Parent Last Name\tStudent ID\tGPA"
				+ "\n==============================================================================================================================";
		// sorting according to Id
		System.out.println("\n----Sort according to Id in Student----");
		Collections.sort(students, (i, j) -> i.getID() > j.getID() ? 1 : -1);
		System.out.println(label);
		for (Student stu : students) {
			System.out.println(stu);
		}
		allStudentsSorted.addAll(students);
		// sorting according to StudentId
				System.out.println("\n----Sort according to StudentId in Student----");
				Collections.sort(students, (i, j) -> i.getStudentID() > j.getStudentID() ? 1 : -1);
				System.out.println(label);
				for (Student stu : students) {
					System.out.println(stu);
				}
				allStudentsSorted.addAll(students);
		// sorting according to lastName
		System.out.println("\n----Sort according to Lastname in Student----");
		Collections.sort(students, (i, j) -> (i.getlName().compareToIgnoreCase(j.getlName())));
		System.out.println(label);
		for (Student stu : students) {
			System.out.println(stu);
		}
		allStudentsSorted.addAll(students);
		// sorting according to firstName
				System.out.println("\n----Sort according to Firstname in Student----");
				Collections.sort(students, (i, j) -> (i.getfName().compareToIgnoreCase(j.getfName())));
				System.out.println(label);
				for (Student stu : students) {
					System.out.println(stu);
				}
				allStudentsSorted.addAll(students);
		// sorting according to GPA
		System.out.println("\n----Sort according to GPA in Student----");
		Collections.sort(students, (i, j) -> i.getGpa() > j.getGpa() ? 1 : -1);
		System.out.println(label);
		for (Student stu : students) {
			System.out.println(stu);
		}
		
		allStudentsSorted.addAll(students);
		return allStudentsSorted;
	}
	
	public List<Student> parseCSV(List<String> studentData){
		
		List<Student> students = new ArrayList<>();
		
		String[] studentCSVLine;
		ConvUtil convertUtil = new ConvUtil(); 
		
		for (String studentCSV :studentData) {
			studentCSVLine = studentCSV.split(",");
			//adding student data to Student class
			students.add(new Student(convertUtil.stringToInt(studentCSVLine[0]), convertUtil.stringToInt(studentCSVLine[1]), studentCSVLine[2], studentCSVLine[3], studentCSVLine[4],
					studentCSVLine[5], convertUtil.stringToInt(studentCSVLine[6]), convertUtil.stringToDouble(studentCSVLine[7])));
		}

		
		
		return students;
	}

	public static void demo() {
		List <String> studentData = FileUtil.read("students.txt");
		Student s = new Student();
		
		List<Student> studentlist= s.parseCSV(studentData);

		List<Student> sortedStudents=s.sortStudent(studentlist); 
		
		FileUtil.write("studentSorted.txt", (sortedStudents)); // write to file
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String toString() {

		StringBuilder str = new StringBuilder();

		  str.append(getID()).append("\t").append(getAge()).append("\t").append(getfName()).append("\t\t  ").append(getlName())
				.append("   \t\t  ").append(getParentFName()).append("  \t\t  ").append(getParentLName()).append("  \t\t  ")
				.append(getStudentID()).append("  \t").append(getGpa());
		return str.toString();
	}

}

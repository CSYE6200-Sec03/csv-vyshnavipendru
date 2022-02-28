package project1;

public class Teacher extends Person {

	public Teacher(int id, int age, String fName, String lName, String parentFName, String parentLName) {
		super(id, age, fName, lName, parentFName, parentLName);
		// TODO Auto-generated constructor stub
	}

	private double hourlyWage;
	

	public Teacher(int id, int age, String fName, String lName, String parentFName, String parentLName,
			double hourlyWage) {
		super(id, age, fName, lName, parentFName, parentLName);
		this.hourlyWage = hourlyWage;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	
	public static void demo()
	{
	Person	teacher =  new Teacher(98,45,"Carl","Sander","Harell","Osen",31);
	
	System.out.println(teacher.toString());
	}

	@Override
	public String toString() {
		return "Teacher \nID=" + getID() + ", Age=" + getAge() + ", First Name="
				+ getfName() + ", Last Name=" + getlName() + ", Parent First Name=" + getParentFName()
				+ ", Parent Last Name=" + getParentLName() + ", hourlyWage=" + hourlyWage ;
	}

	
	
	
}

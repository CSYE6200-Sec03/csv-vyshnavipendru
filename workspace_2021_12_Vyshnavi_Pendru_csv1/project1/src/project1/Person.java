package project1;

public class Person {

	private int ID;
	private int age;
	private String fName;
	private String lName;
	private String parentFName;
	private String parentLName;
	public Person(int iD, int age, String fName, String lName, String parentFName, String parentLName) {
		super();
		ID = iD;
		this.age = age;
		this.fName = fName;
		this.lName = lName;
		this.parentFName = parentFName;
		this.parentLName = parentLName;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getParentFName() {
		return parentFName;
	}
	public void setParentFName(String parentFName) {
		this.parentFName = parentFName;
	}
	public String getParentLName() {
		return parentLName;
	}
	public void setParentLName(String parentLName) {
		this.parentLName = parentLName;
	}
	
	
	
	
	
	
}

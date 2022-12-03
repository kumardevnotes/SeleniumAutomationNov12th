package access.specifiers.demo;

//Inheritance
public class StdClass extends SchoolClass{ //ChildClass extends ParentClass
	
	public static final int stdId = 1001;

	public static void main(String[] args) {
		StdClass stdObj = new StdClass();
		stdObj.displayStdName();
		stdObj.displayStdId();
		stdObj.displaySchoolName();
		stdObj.displaySchoolAddress();
		
		SchoolClass schoolObj = new SchoolClass();
		//If you uncomment it will throw an error bcoz it is a private method
		//schoolObj.displaySchoolName();
		schoolObj.displaySchoolAddress();
	}

	public void displayStdName() {
		System.out.println("John");
	}

	public void displayStdId() {
		//stdId  = 2002;
		System.out.println(stdId);
	}
	
	//Overiding the method which is in SchoolClass - Dynamic Polymorphism
	public void displaySchoolName() {
		System.out.println("Modern High School");
	}

}

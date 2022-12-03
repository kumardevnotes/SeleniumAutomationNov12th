package access.specifiers.demo;

public  class SchoolClass {

	public static void main(String[] args) {
		SchoolClass schoolObj = new SchoolClass();
		schoolObj.displaySchoolName();
		schoolObj.displaySchoolAddress();
	}
	
	private  void displaySchoolName() {
		System.out.println("Grammars High School");
	}

	public void displaySchoolAddress() {
		System.out.println("101, Main street , NY, 5060606");
	}

}

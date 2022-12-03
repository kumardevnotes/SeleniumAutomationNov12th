package cm.overloading.demo;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		//Method overloading
		displayName();
		displayName("JohnMiller");
		displayName("John", "Miller");
		int stdId = displayName("John", 1122);
		System.out.println(stdId);
	}

	//method signature
	private static int displayName(String firstName, int stdId) {
		System.out.println(firstName);
		return stdId;
	}

	private static void displayName(String firstName, String lastName) {
		System.out.println(firstName + " " + lastName);
	}

	private static void displayName(String stdName) {
		System.out.println(stdName);
	}

	private static void displayName() {
	System.out.println("Sam");
	}

}

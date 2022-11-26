package com.practice.java;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		String dayOfTheWeek = "Monday";
		switch (dayOfTheWeek) { // Saturday
		case "Monday":
			System.out.println("Lets goto work");
			System.out.println("Morning time");
			System.out.println("Lunch time");
			break;
		case "Tuesday":
			System.out.println("the week started just one day ago!");
			break;
		case "Wednesday":
			System.out.println("Still you need to wait for weekened!");
			break;
		case "Thursday":
			System.out.println("Prepare for weekend!");
			break;
		case "Friday":
			System.out.println("We will leave early to join the party!");
			break;
		case "Saturday":
			System.out.println("On party mood. No work");
			break;
		case "Sunday":
			System.out.println("The fun will be over. Tomorrow you have office");
			break;
		default:
			System.out.println("You passed invalid day. Please check");
		}

		System.out.println("Switch block execution completed");
	}

}

package javaPrograms;

public class DayExample {

	public static void main(String[] args) {
		int week = 5;
		String day;

		switch (week) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");

			break;
		case '3':
			day = ("Wednesday");
			System.out.println("Have an awesome day!");
			break;
		case '4':
			System.out.println("Thursday");
			break;
		case '5':
			System.out.println("Friday");
			break;
		case '6':
			System.out.println("Saturday");
			break;
		case '7':
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid day");

		}
		System.out.println("Select a different day");
	}

	// TODO Auto-generated method stub

}

package practicePrograms;

public class SmartCalculator {

	public static void main(String[] args) {
		char operator = '+';
		double num1=9, num2=2, result;
		System.out.println("Your first number"+num1);
		System.out.println("Your second number"+num2);

		switch(operator) {
		case '+':
			result=num1+num2;
			System.out.println(result);
			break;
		case '-':
		result=num1 - num2;
		System.out.println(result);
		break;
		case '*':
		result=num1 * num2;
		System.out.println(result);
		break;
		case '/':
		result=num1 / num2;
		System.out.println("Result = " + result);
		break;
		}

	}

}

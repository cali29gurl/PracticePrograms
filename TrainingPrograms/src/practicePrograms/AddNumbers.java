package practicePrograms;
import java.util.Scanner;

public class AddNumbers {
	public static void main(String args[]) {
		int x, y, z, a, b, c;
		System.out.println("Enter two intergers to calculate their sum");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		z = x + y;
		a = x - y;
		b = x * y;
		c = x / y;
		System.out.println("Sum of entered intergers =" + z + " " + a + " " + b + " " + c);
		System.out.println("Diff of enetered intergers = +a");
		System.out.println("Mul of enetered intergers = *b");
		System.out.println("Div of enetered intergers = /c");
	}
}

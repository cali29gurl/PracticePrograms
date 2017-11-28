package javaPrograms;

import java.util.Scanner;

public class WhileLoopExample {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int mult;
		System.out.print("Enter in the number you want to multiply by");

		mult = input.nextInt();
		int i = 1;
		while (i <= 10) {
			System.out.println(i * mult);

			i++;
		}

	}

}

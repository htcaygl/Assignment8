package assignment8;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		cube();

	}

	public static void cube() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = scan.nextInt();

		System.out.println("The cube of number is: " + (num * num * num));

		scan.close();
	}

}

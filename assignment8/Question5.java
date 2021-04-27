package assignment8;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();

		sign(num);

		scan.close();
	}

	public static void sign(int number) {
		if (number > 0)
			System.out.println("1");
		else if (number == 0)
			System.out.println("0");
		else
			System.out.println("-1"); 

	}

}

package assignment8;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = scan.nextInt();
		next3(num);
		
		scan.close();

	}

	public static void next3(int number) {
		
		System.out.println((number+1)+" "+(number+2)+" "+(number+3));

	}

}

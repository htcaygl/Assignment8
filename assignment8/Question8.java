package assignment8;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = scan.nextInt();
		fib(num);
		scan.close();
	}

	public static void fib(int number) {
		
		int first=0, sum=0;
		int second=1;

		for(int i=2;i<number;i++) {
			
			sum=first+second;
			first=second;
			second=sum;
						
		}
		if(number==2)
			sum=1;
		
		System.out.println(sum);

	}

}

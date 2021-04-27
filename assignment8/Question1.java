package assignment8;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     plus();
	}

	 public static void plus() {
		 
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter first number: ");
		 int f=scan.nextInt();
		 System.out.println("Enter second number: ");
		 int s=scan.nextInt();
		 
		 System.out.println("result: " +(f+s));
		 
		 scan.close();
		 
		 
	 }
}

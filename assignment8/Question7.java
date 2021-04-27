package assignment8;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = scan.nextInt();
		
		
		System.out.println(isPalindrome(num));
		scan.close();
	}

	public static boolean isPalindrome(int num) {
		int newNum=0 ; 
		
		
		int reminder;
		int first =num%10 ;    
		reminder=num/10;
		int second= reminder%10;
		reminder=reminder/10;
		int third= reminder%10;
		int fourth=reminder/10;
			
		
	    newNum= first*1000+second*100+third*10+fourth;
			
		
		if(num==newNum)
			return true;
		else 
			return false;

	}

}

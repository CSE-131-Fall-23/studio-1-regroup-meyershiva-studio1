package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a year (YYYY)");
		int n1 = in.nextInt();
		
		int remainder4 = n1 % 4;
		int remainder100 = n1 % 100;
		int remainder400 = n1 % 400;
		boolean result = (remainder4 == 0) && (remainder100 != 0) || (remainder400 == 0);
		System.out.println(n1 + " is a leap year: " + result);
		
		
		
	}

}

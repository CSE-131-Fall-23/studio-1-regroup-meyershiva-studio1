package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the following values to be averaged:");
		System.out.print("Enter value 1: ");
		int n1 = in.nextInt();
		System.out.print("Enter value 2: ");
		int n2 = in.nextInt();
		double avg = (n1+n2)/2;
		System.out.println("The average is: " + avg);
	}

}

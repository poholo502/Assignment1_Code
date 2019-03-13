package assignment1Code;

import java.util.Scanner; //Import the Scanner class for user input

public class NumberChecking {
	public static void main(String[] args) {
		Scanner userVal = new Scanner(System.in); // creating a Scanner object
		
		System.out.println("Please enter a number: ");
		
		int userNum = userVal.nextInt(); //Read user number
		
		
		if(userNum < 0) {
			System.out.println("Number entered is NEGATIVE!");
		}else {
			System.out.println("Number entered is POSITIVE!");
		}
	}
}
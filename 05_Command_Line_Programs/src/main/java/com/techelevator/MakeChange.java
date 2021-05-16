package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the amount of the bill: $");
		double totalAmountOfBill = input.nextDouble();
		input.nextLine();

		System.out.println("Enter the amount tendered: $");
		double totalAmountTendered = input.nextDouble();
		input.nextLine();

		double totalChange = totalAmountTendered - totalAmountOfBill;

		System.out.println("The change required is: $" + totalChange);



	}

}

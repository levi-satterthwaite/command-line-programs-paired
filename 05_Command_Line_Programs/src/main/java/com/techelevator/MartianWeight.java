package com.techelevator;

import java.util.Scanner;

/*
 In case you've ever pondered how much you weight on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

 $ MartianWeight 
 
Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth, is 37 lbs. on Mars.
 235 lbs. on Earth, is 88 lbs. on Mars.
 185 lbs. on Earth, is 69 lbs. on Mars. 
 */
public class MartianWeight {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a series of Earth weights separated with a space: ");

		String userEarthWeights = input.nextLine();

		//double userStringToDoubleConversion =  Double.parseDouble(userEarthWeights);

		String earthWeightsStringArray[] = userEarthWeights.split(" ");

		int earthWeightsIntegerArray[] = new int[earthWeightsStringArray.length];

		for(int i = 0 ; i < earthWeightsStringArray.length ; i++) {

			earthWeightsIntegerArray[i] = Integer.parseInt(earthWeightsStringArray[i]);
		}
		//For Loop to run an

		//System.out.println(earthWeightsIntegerArray[3]);

		for( int i = 0 ; i < earthWeightsIntegerArray.length ; i++ ) {
			double martianWeight = earthWeightsIntegerArray[i] * 0.378;
			System.out.println(earthWeightsIntegerArray[i] + " lbs. on Earth, is " + martianWeight + " lbs. on Mars.");
		}
		//System.out.println("What is the height of the container in feet: ");
		//String userHeightOfContainer = input.nextLine();
		//double heightOfContainer = Double.parseDouble( userHeightOfContainer );








	}

}

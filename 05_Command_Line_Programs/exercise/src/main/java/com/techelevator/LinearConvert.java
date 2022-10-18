package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		runApp();
	}

	public static void unitConversion(int length, String lengthUnits){
		int conversionLength;

		if(lengthUnits.equals("f")){
			conversionLength = feetToMeters(length);
			System.out.println( length + "f is " + conversionLength + "m.");


		} else if(lengthUnits.equals("m")){
			conversionLength = metersToFeet(length);
			System.out.println( length + "m is " + conversionLength + "f.");

		}
	}

	public static int feetToMeters(int length){
		int finalLength = (int)(length * 0.3048);

		return finalLength;
	}

	public static int metersToFeet(int length){
		int finalLength = (int)(length * 3.2808399);

		return finalLength;
	}

	public static void runApp(){
		Scanner scan = new Scanner(System.in);

		int length;
		String distanceUnit;


		// user length prompt
		System.out.print("Please enter the length: ");
		length = scan.nextInt();

		// user unit prompt
		System.out.print("Is the measurement in (m)eter, or (f)eet? ");
		distanceUnit = scan.next();

		// call conversion function
		unitConversion(length, distanceUnit);


	}

}

package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		runApp();
	}

	public static void unitConversion(int temp, String tempUnits){
		int conversionTemp;

		if(tempUnits.equals("C")){
			conversionTemp = celsiusToFarenheit(temp);
			System.out.println( temp + "C is " + conversionTemp + "C.");


		} else if(tempUnits.equals("F")){
			conversionTemp = farenheitToCelsius(temp);
			System.out.println( temp + "F is " + conversionTemp + "C.");

		}
	}

	public static int celsiusToFarenheit(int temp){
		int finalTemp = (int)(temp * 1.8 + 32);

		return finalTemp;
	}

	public static int farenheitToCelsius(int temp){
		int finalTemp = (int)((temp - 32) / 1.8);

		return finalTemp;
	}

	public static void runApp(){
		Scanner scan = new Scanner(System.in);

		int temp;
		String tempUnit;


		// user temp prompt
		System.out.print("Please enter the temperature: ");
		temp = scan.nextInt();

		// user unit prompt
		System.out.print("Is the temperature in (C)elsius, or (F)ahrenheit? ");
		tempUnit = scan.next();

		// call conversion function
		unitConversion(temp, tempUnit);


	}

}

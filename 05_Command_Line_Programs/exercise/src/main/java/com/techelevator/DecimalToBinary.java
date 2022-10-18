package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {
// input Decimal , output Binary
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Variables
		int decimalValue;
		String inputString;

		//Console Input
		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		inputString = scan.nextLine();
		String[] splitedDecimal = inputString.split(" ");
		System.out.println();

		// loop through string of numbers
		for(int i = 0; i < splitedDecimal.length; i++){
			decimalValue = Integer.parseInt(splitedDecimal[i]);
			System.out.println(decimalValue + " in binary is " + binaryConverter(decimalValue));
		}


	}

	public static String binaryConverter(int decimalValue ){
		int topNumber = decimalValue;
		int remainderNumber;
		String binaryString = "";

		// ends if topNumber is 1
		while(topNumber > 0){

			// modulus operator by 2
			remainderNumber = topNumber % 2;

			// remainder is 1 or 0 and put in binary string
			binaryString = remainderNumber + binaryString;


			// if remainderNumber is 1 then substract 1
			if(remainderNumber == 1){
				topNumber--;
			}

			// divide topNumber by 2 and save it to topNumber
			topNumber = topNumber / 2;

		}


		return binaryString;
	}

}

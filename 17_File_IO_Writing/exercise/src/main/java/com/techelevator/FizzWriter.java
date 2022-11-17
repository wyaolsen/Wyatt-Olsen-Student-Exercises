package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {
		fizzWriter();
	}

	public static void fizzWriter(){
		Scanner userInput = new Scanner(System.in);



		System.out.println("What is the destination file?");
		String outputFileName = userInput.nextLine();


		File outputFile = new File(outputFileName);


		try{

			PrintWriter dataOutput = new PrintWriter(outputFile);
			for(int i = 1; i <= 300; i++){



				int inputLine = i;
				if(inputLine % 3 == 0 && inputLine % 5 == 0){
					dataOutput.println("FizzBuzz");
				}else if(inputLine % 3 == 0){
					dataOutput.println("Fizz");
				}else if(inputLine % 5 == 0){
					dataOutput.println("Buzz");
				}else{
					dataOutput.println(inputLine);
				}

			}
			dataOutput.close();

		}catch(FileNotFoundException e){
			System.err.println("Cannot open the file for writing.");
		}

	}

}

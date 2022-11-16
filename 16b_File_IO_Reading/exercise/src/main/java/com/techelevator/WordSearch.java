package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		//file name user input
		System.out.println("What is the fully qualified name of the file that should be searched?");
		String fileName = userInput.nextLine();

		System.out.println("What is the search word you are looking for?");
		String searchWord = userInput.nextLine();

		System.out.println("Should the search be case sensitive? (Y\\N)");
		String isSensitive = userInput.nextLine();



		searchFile(fileName,searchWord,isSensitive);



	}



	public static void searchFile(String fileName, String searchWord, String inSensitive){
		try{
			File wordSearchFile = new File(fileName);
			Scanner fileScanner = new Scanner(wordSearchFile);

			int lineCount = 0;

			while(fileScanner.hasNextLine()){
				lineCount++;
				String fileNextLine = fileScanner.nextLine();

				// case insensitive
				if(inSensitive.equals("Y")){
					if(fileNextLine.contains(searchWord)){
						System.out.println(lineCount + ") " + fileNextLine);
					}
				}else if(inSensitive.equals("N")){
					if(fileNextLine.toLowerCase().contains(searchWord.toLowerCase())){
						System.out.println(lineCount + ") " + fileNextLine);
					}
				}


			}
			fileScanner.close();
		}catch (FileNotFoundException e){
			System.out.println(e);
		}
	}


}

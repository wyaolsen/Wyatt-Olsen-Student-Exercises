package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuizMaker {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter the fully qualified name of the file to read in for quiz questions");
		String filename = userInput.nextLine();

		startQuiz(filename);

	}

	public static void startQuiz(String filename){
		Scanner userinput = new Scanner(System.in);

		try{
			File quizFile = new File(filename);
			Scanner fileScanner = new Scanner(quizFile);

			int questionCount = 0;
			int correctAnswerCount = 0;

			while(fileScanner.hasNextLine()){
				String[] question = fileScanner.nextLine().split("\\|");

				//print question
				System.out.println(question[0]);
				int correctAnswer = 0;
				//print answers
				for(int i = 1; i < question.length; i++ ){
					if(question[i].contains("*")){

						correctAnswer = i;
					}
					System.out.println(i + ". " + question[i].replace("*", ""));
				}

				System.out.println();
				System.out.print("Your answer: ");
				int userAnswer = userinput.nextInt();
				if(correctAnswer == userAnswer){
					System.out.println("RIGHT!");
					correctAnswerCount++;
				}else{
					System.out.println("WRONG!");
				}
				System.out.println();

				questionCount++;
			}

			System.out.println("You got " + correctAnswerCount + " answer(s) correct out of the " + questionCount + " questions asked.");

			fileScanner.close();
		}catch(FileNotFoundException e){
			System.out.println(e);
		}

	}

}

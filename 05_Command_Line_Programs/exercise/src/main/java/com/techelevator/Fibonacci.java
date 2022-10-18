package com.techelevator;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		// run app
		runApp();
	}

	public static ArrayList findFib(int sequenceNumber){
		ArrayList<Integer> fibSequence = new ArrayList<Integer>();
		fibSequence.add(0);
		fibSequence.add(1);
		boolean fibMaxFlag = (sequenceNumber > fibSequence.get(fibSequence.size() - 1));

		//loop til max fib
		while(fibMaxFlag){
			// next fib
			int nextFib = fibSequence.get(fibSequence.size() - 1) + fibSequence.get(fibSequence.size() - 2);
			if(sequenceNumber >= nextFib){
				fibSequence.add(nextFib);
			}else {
				fibMaxFlag = false;
			}
		}

		//return fib sequence
		return fibSequence;
	}

	public static void printFib(ArrayList<Integer> fibSequence){
		for(int fib : fibSequence) {
			System.out.print(fib + ", ");
		}
	}


	public static void runApp(){
		Scanner scan = new Scanner(System.in);
		int maxFib;
		ArrayList<Integer> fibSequence;

		// please enter a number
		System.out.print("Please enter a number: ");
		maxFib = scan.nextInt();

		// fibonacci number
		fibSequence = findFib(maxFib);

		// make space
		System.out.println();

		// Print fibNum
		printFib(fibSequence);
	}
}

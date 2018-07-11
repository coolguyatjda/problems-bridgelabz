package com.jda.AlgorithmProblems.core;

import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.nextLine());
		int upper = (N-1);
		int lower = 0;
		while(true){
			System.out.println("Is your number  " + (lower+upper)/2);
			String str = in.nextLine();
			System.out.println("Enter MORE OR LESS OR EQUAL");
			if(str.equals("EQUAL"))
				break;
			else{
				if(str.equals("MORE"))
					lower = (lower+upper)/2+1;
				else if(str.equals("LESS"))
					upper = (lower+upper)/2-1;
				else
					System.out.println("Enter MORE OR LESS");
			}
		}
	}
	}

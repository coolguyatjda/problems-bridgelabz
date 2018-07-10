package com.jda.AlgorithmProblems.core;

import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.nextLine());
		int ans = N/2;
		while(true){
			System.out.println("Is your number  " + ans);
			String str = in.nextLine();
			if(str.equals("YES"))
				break;
			else{
				if(str.equals("MORE"))
					ans = ans + 1 + ans/2;
				else if(str.equals("LESS"))
					ans = ans -1 -  ans/2;
				else
					System.out.println("Enter MORE OR LESS");
			}
		}
	}
	}

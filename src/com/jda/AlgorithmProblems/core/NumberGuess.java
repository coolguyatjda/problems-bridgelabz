package com.jda.AlgorithmProblems.core;

import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int arr[] = new int[N];
		for(int i=0; i<N; i++)
			arr[i] = i;
		String str = "";
		while(str != "YES"){
			int value = BinarySearch.index(arr, (N-1)/2, 0, N-1);
			str = in.nextLine();
			if(str = "NO")
				
		}
	}
	}

package com.jda.AlgorithmProblems.core;

import java.util.Scanner;

import com.jda.AlgorithmProblems.util.Utility;

public class PalindromePrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int arr[] = PrimeNumbers.primes(N);
		for(int i=2; i<N+1; i++){
			if(arr[i] == 0)
			   if(Utility.isPalind(i) && i>10)
				   System.out.print(i + " ");
		}
		System.out.println();

	}

}

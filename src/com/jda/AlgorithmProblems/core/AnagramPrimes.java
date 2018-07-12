package com.jda.AlgorithmProblems.core;

import java.util.Scanner;

public class AnagramPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int arr[] = PrimeNumbers.primes(N);
		for(int i=10; i<N; i++){
			for(int j=i+1; j<N+1; j++){
				if(arr[i] == 0){
					if(AnagramDetection.check(Integer.toString(i), Integer.toString(j)))
						System.out.println(i + " and " + j + " are anagrams");
				}
			}
		}
	}

}

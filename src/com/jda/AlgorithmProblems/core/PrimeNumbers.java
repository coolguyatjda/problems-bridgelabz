package com.jda.AlgorithmProblems.core;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int a[] = primes(N);
		for(int i=2; i<N+1; i++){
			if(a[i] == 0)
			    System.out.print(i + " ");
		}
			System.out.println();
	}
	public static int[] primes(int N){
		int arr[] = new int[N+2];
		for(int i=2; i<=(int)Math.sqrt(N); i++){
			int count  = i;
			while(count*i <= N+1){
				if(arr[i] == 1)
					break;
				arr[count*i] =1;
				count++;
			}
		}
		return arr;
	}

}

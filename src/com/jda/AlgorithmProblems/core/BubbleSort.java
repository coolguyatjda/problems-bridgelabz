package com.jda.AlgorithmProblems.core;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int arr[] = new int[N];
		for(int i=0; i<N; i++)
			arr[i] = in.nextInt();
		long now = System.currentTimeMillis();
		arr = bubble(arr, N);
		for(int i=0; i<N; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		System.out.println("The time elasped is " + (System.currentTimeMillis()-now)/1000.0);

	}
	public static int[] bubble(int arr[], int N){
		for(int i=0; i<N; i++){
			for(int j=0; j<N-1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
}

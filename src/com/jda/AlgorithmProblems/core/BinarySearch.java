package com.jda.AlgorithmProblems.core;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int arr[] = new int[N];
		for(int i=0; i<N; i++)
			arr[i] = in.nextInt();
		int key = in.nextInt();
		long now = System.currentTimeMillis();
		int ans = index(arr, key , 0, N-1);
		if(ans != -1)
			System.out.println(ans+1);
		else
			System.out.println("Not found");
		System.out.println("The time elasped is " + (System.currentTimeMillis() - now)/1000.0);
	}
	public static int index(int [] arr, int num, int i,int j){
		int min = i;
		int max = j;
		while(min <= max){
			if(arr[(max+min)/2] == num){
				return (max+min)/2;
			}else if(arr[(max+min)/2] > num){
				
				return index(arr, num, i, (max+min)/2);
			}else{
				return index(arr, num, (max+min)/2+1, j);
			}
		}
		return -1;
	}
	
}

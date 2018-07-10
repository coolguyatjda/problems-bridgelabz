package com.jda.AlgorithmProblems.core;

import java.util.Scanner;

public class InsertionSortStrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner(System.in);
		int N = Integer.parseInt(in.nextLine());
		String strs[] = new String[N];
		for(int i=0; i<N; i++)
			strs[i] = in.next();
		strs = insertionSort(strs, N);
		for(int i=0; i<N; i++)
			System.out.print(strs[i] + " ");
		System.out.println();

	}
	public static String[] insertionSort(String[] strs, int N){
		for(int i=0; i<N-1; i++){
			for(int j=i; j<N; j++){
				if(strs[i].compareTo(strs[j]) > 0){
					String str = strs[i];
					strs[i] = strs[j];
					strs[j] = str;
				}
			}
		}
		return strs;
	}

}

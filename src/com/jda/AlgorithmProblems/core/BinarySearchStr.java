package com.jda.AlgorithmProblems.core;

import java.util.Scanner;

import com.jda.AlgorithmProblems.util.Utility;
/**
 * 
 * @author bridgelabz
 *Takes in a str
 */
public class BinarySearchStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char key[] = in.nextLine().toCharArray();
		long now = System.currentTimeMillis();
		int arr[] = Utility.toInt(str);
		int ans = BinarySearch.index(arr, (int)(key[0]-'A'), 0, str.length()-1);
		if(ans != -1)
			System.out.println(ans+1);
		else 
			System.out.println("Not Found");
		System.out.println("The time elasped is " + (System.currentTimeMillis()-now)/1000.0);
	}

}

package com.jda.fuctionalprograms.core;
import java.util.Scanner;

import com.jda.fuctionalprograms.util.FourthUtil;

public class FourthProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int a[] = FourthUtil.powerArray(N);
		for(int i=0;i<N;i++){
			System.out.println(a[i]);
		}
	}

}

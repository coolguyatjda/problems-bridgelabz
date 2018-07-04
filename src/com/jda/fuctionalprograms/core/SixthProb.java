package com.jda.fuctionalprograms.core;
import java.util.Scanner;

import com.jda.fuctionalprograms.util.SixthUtil;

public class SixthProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for(int i=2; i<=Math.sqrt(N); i++){
			if(SixthUtil.isPrime(i)){
				if(N%i == 0)
					System.out.println(i);
			}
		}
	}
}

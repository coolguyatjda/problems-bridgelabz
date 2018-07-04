package com.jda.fuctionalprograms.core;
import java.util.Scanner;

import com.jda.fuctionalprograms.util.SixthUtil;

public class SixthProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		while(N != 1){
			int num = SixthUtil.isPrime(N);
			System.out.print(num + " ");
			N /= num;
			}
		}
	}

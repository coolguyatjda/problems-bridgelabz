package com.jda.fuctionalprograms.util;

public class SixthUtil {
	public static boolean isPrime(int N){
		for(int i=2; i<Math.sqrt(N); i++){
			if(N%2 == 0)
				return false;
		}
		return true;
	}
}

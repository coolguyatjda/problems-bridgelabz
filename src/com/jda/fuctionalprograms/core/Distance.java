package com.jda.fuctionalprograms.core;
import java.util.Scanner;

/**
 * 
 * @author bridgelabz
 *The class takes in two real numbers as its input and returns the euclidian distance of the 
 *point from origin
 */
public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a, b;
		a = input.nextInt();
		b = input.nextInt();
		System.out.println(euclidian(a, b));
	}
	public static double euclidian(int a, int b){
		double ans = a*a + b*b;
		ans = Math.sqrt(ans);
		return ans;
	}

}

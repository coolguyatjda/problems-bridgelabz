package com.jda.AlgorithmProblems.core;

import java.util.Scanner;

public class MonthlyPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		float P = in.nextFloat(); float Y = in.nextFloat(); float R = in.nextFloat();
		System.out.println("the monthly pament to be made is " + payment(P, Y, R));

	}
	public static float payment(float P, float Y, float R){
		float n = 12*Y;
		float r = R/(12*100);
		float payment = P*r/(1 + (float)Math.pow(1+r, -1*n));
		return payment;
	}

}

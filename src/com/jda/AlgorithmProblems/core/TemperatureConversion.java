package com.jda.AlgorithmProblems.core;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter f or c");
		String str = in.nextLine();
		if(str == "f" )
			System.out.println("The temperature in Celcius is " + ftoc(in.nextFloat()));
		else
			System.out.println("The temperature in farenheit is " +  ctof(in.nextFloat()));
	}
	public static float ftoc(float f){
		float c = (f-32)*5/9;
		return c;
	}
	public static float ctof(float c){
		float f = (9*c/5) + 32;
		return f;
	}

}

package com.jda.AlgorithmProblems.core;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		float m = in.nextFloat(); float d = in.nextFloat(); float y = in.nextFloat();
		System.out.println(day(m, d, y));
	}
	
	public static float day(float m, float d, float y){
		float y0 = y - (14 - m)/12;
		float x = y0+y0/4-y0/100+y0/400;
		float m0 = m + 12*((14-m)/12)-2 ;
		float d0 = (d + x + 31*m0/12) % 7;
		return d0;
	}
}

package com.jda.fuctionalprograms.core;
import java.util.Scanner;

public class Stopwatch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String start = in.nextLine();
		long now = System.currentTimeMillis();
		String stop = in.nextLine();
		System.out.println((double)(System.currentTimeMillis() - now)/1000.0);
	}
}

package com.jda.AlgorithmProblems.core;

import java.util.Scanner;

import com.jda.AlgorithmProblems.util.*;

public class MergeSortStrs {
	public static void merge(int[] arr,int low,int up,int mid)
	{
		int [] temp=new int[arr.length];
		int i,j,k;
		i=low;
		k=low;
		 j=mid+1;
		
		while(i<=mid && j<=up)
		{
			if(arr[i]<=arr[j])
				temp[k++]=arr[i++];
			else
				temp[k++]=arr[j++];
		}
		while(i<=mid)
			temp[k++]=arr[i++];
		while(j<=up)
			temp[k++]=arr[j++];
		for(i=low;i<=up;i++)
			arr[i]=temp[i];
		return;
	}
    public static void mergeSort(int[] arr,int l,int h)
    {
    	
    	if(l<h)
    	{
    		int mid=l+(h-l)/2;
    		mergeSort(arr,l,mid);
    		mergeSort(arr,mid+1,h);
    		merge(arr,l,h,mid);
    	}
    }
	public static void main(String[] args) {
		System.out.println("Enter size and elements of Integer array");
		Scanner in = new Scanner(System.in);
		int size=in.nextInt();
		int[]  arr=new int[size];
		for(int i=0;i<size;i++)
		{
		     arr[i]=in.nextInt();
		}
	mergeSort(arr,0,arr.length-1);
	System.out.println("Sorted array:");
	for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");

	}

}
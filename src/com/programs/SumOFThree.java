package com.programs;

import java.util.Scanner;

public class SumOFThree {

	public static int distinctTriplets(int arr[],int length) {
		int i,j,k,count=0;
		for(i=0;i<length;i++)
		{
			for(j=i+1;j<length;j++) {
				
				for(k=j+1;j<length;k++) {
					
					if(arr[i]+arr[j]+arr[k]==0) {
						System.out.println(arr[i]+arr[j]+arr[k]);
						count++;
						
					}
				}
			}
		}
		return count;
		
		
	}
	public static void main(String[] args) {
		System.out.println("Enter the Size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int r=distinctTriplets(arr,size);
		System.out.println("triplets : "+r);
	}

}

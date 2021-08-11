package com.bridgelabz.logical;

import java.util.Scanner;

public class REverseNumber {

	public static void main(String[] args) {
		int rem,sum=0;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		while(num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
					
		}
	
			System.out.println("reverse number : "+sum);
		
		
	}

}

package com.programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int flag=0;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num==0||num==1) {
			System.out.println("number is not a Prime number");
			
		}else {
			
				for(int i =2;i<=num/2;i++) {
					if(num%i==0) {
						System.out.println("number is not a Prime number");
				          flag=1;
				          break;
					}
				}
				
			
			if(flag==0) {
				System.out.println("number is a Prime number");
			}
		}
	}

}

package com.programs;

import java.util.Scanner;

public class FactorsProblem {

	static boolean primeNo(int n) {
		for(int i=2;i>n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int num=sc.nextInt();
		int fact=1;
		for(int i=2;i<num;i++) {
			{
				if(primeNo(i)) {
					System.out.println(i);
				}
			}
			
		}
       System.out.println(fact);
	}

}

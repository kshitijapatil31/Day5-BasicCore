package com.programs;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int temp=0;
		Scanner sc=new Scanner(System.in);
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println("Before swap"+a+"  "+b);
				temp=a;
				a=b;
				b=temp;
				System.out.println("After swap"+a+"  "+b);
				
				

	}

}

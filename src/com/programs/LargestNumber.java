package com.programs;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		if(x>y&&x>z) {
			System.out.println("X is greater than Y and Z");
			
		}else if(y>z&& y>x) {
			System.out.println("Y is greater than X and Z ");
		}else {
			System.out.println("Z is greater than X and Y ");
		}
	}

}

package com.programs;

import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int divident=sc.nextInt();
	int divisor=sc.nextInt();

	int Quotient=divident/divisor;
	int Remainder=divident%divisor;
	
	System.out.println(Quotient);
	System.out.println(Remainder);
	}

}

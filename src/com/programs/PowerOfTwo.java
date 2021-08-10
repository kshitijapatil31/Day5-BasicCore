package com.programs;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
           System.out.println("Power of 2^"+num+": "+Math.pow(2, num));
           System.out.println();
           System.out.println("all power values till"+num);
           for(int i=1;i<=num;i++) {
        	   System.out.println("Power of 2^"+i+": "+Math.pow(2, i));
           }
           
	}

}

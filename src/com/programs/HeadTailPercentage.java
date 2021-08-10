package com.programs;

import java.util.Scanner;

public class HeadTailPercentage {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int noOfFlips=sc.nextInt();
		int head=0;
		int tail=0;
		for(int i=0;i<noOfFlips;i++) {
			double num=Math.random();
			if(num<0.5) {
				head++;
			}else {
				tail++;
			}
		}
		double headPercentage=((double)head/(double)noOfFlips)*100;
		double tailPercentage=((double)tail/(double)noOfFlips)*100;

		System.out.println(headPercentage);
		System.out.println(tailPercentage);
	}

}

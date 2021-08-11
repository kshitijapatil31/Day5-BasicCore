package com.bridgelabz.logical;
import java.util.*;
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int n=num/2;
		int val=0;
		for(int i=1;i<=n;i++) {
			if(num%i==0) {
				val+=i;
			}
		}
		if(val==num) {
			System.out.println("The number is perfect number");
		}else {
			System.out.println("The number is not a perfect number");
		}

	}

}

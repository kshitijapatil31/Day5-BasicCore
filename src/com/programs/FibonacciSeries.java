package com.programs;
import java.util.*;
public class FibonacciSeries {

	public static void main(String[] args) {
		int n1=0,n2=1,n3=0;
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		System.out.print(n1+" "+n2);

		for(int i=1;i<count;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
		}
	}

}

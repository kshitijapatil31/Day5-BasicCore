package com.programs;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
        Double num=sc.nextDouble();
        double value=harmonicNumber(num);
        if(num>0) {
        	System.out.println("the Harmonic value :"+value);
        }else {
        	System.out.println("The number is greater than zero");
        }
	
	}
     public static double harmonicNumber(double val) {
    	 double sum=0.0;
    	 for(int i=1;i<=val;i++) {
    		 sum+=(1.0/i);
    	 }
    	 return sum;
     }
     
     
	

}

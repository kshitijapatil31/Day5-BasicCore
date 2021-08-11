package com.bridgelabz.logical;
import java.util.*;

public class StopWatch {
	
	static long start=0;
	static long stop=0;
	public static void startWatch() {
		 start=System.currentTimeMillis();
		System.out.println(start);
				
	}
	public static void stopWatch() {
		 stop=System.currentTimeMillis();
		System.out.println(stop);
	}
	public static long elapsedTime() {
		long elapsedtime=stop-start;
		return elapsedtime;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a start to start the stopwatch");
		String str1=sc.nextLine();
		startWatch();
		
		System.out.println("Enter a start to start the stopwatch");
		String str2=sc.nextLine();
		stopWatch();
		
		System.out.println("Elapsed Time : "+elapsedTime());
		

	}

}

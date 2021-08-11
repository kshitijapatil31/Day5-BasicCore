package com.bridgelabz.logical;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		int rem=0,totalNotes=0;
		int note[]= {1000,500,200,100,50,10,5,2,1};
		System.out.println("Enter the amount");
		Scanner sc=new Scanner(System.in);
		int money=sc.nextInt();
		if(money==0) {
			System.out.println("money is not enter");
		}else {
			
		for(int i=0;i<note.length;i++) {
			
			if(money>=note[i]) {
				int cal=money/note[i];
				rem=money%note[i];
				money=rem;
				totalNotes=totalNotes+cal;
				System.out.println(note[i]+" : "+totalNotes);
			}
			
		}
			
		}

	}

}

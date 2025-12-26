package com.raksha;
import java.util.Scanner;
public class OptimizecodeofFactorsC {
	
	public static int factorCount(int n) {
		int count= 0;
		for(int i=1; i*i<=n; i++) {
			if(n%i == 0) {
				if(n/i == i) {
					count++;
				}
				else {
					count += 2;
	            }			
			}
		}
		return count;
	}	
	public static void main(String[] args) {
		
		int n;
		System.out.println("enter the number.....");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int sol= factorCount(n);
	    System.out.println(sol);	
	}
}

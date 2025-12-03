package com.raksha;
import java.util.Scanner;
public class MaxValueApp1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("enter the elements");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}	
		int max = arr[0]; // { int max = -1;}
		
		for(int i=0; i<n; i++) {
			if(arr[i] > max) {
				max = arr[i] ;
			}
		}
		System.out.println("maximum value is = "+ max);
	}

}

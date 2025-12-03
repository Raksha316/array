package com.raksha;
import java.util.Scanner;
public class DemoScanner {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("enter the elements in the array");
		 for(int i = 0; i<n; i++) {
			 arr[i] = sc.nextInt();
		 }
		 System.out.println("printing the array");
		for(int i = 0; i <= n-1; i++) {
			System.out.println(arr[i]);
		}
	}

}

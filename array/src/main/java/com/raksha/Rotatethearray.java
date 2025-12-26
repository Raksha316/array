package com.raksha;

public class Rotatethearray {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		System.out.println("printing the array................");
		
		for(int ele:arr) {
			System.out.println(ele);
			
		}
		int i=0;
		int j=arr.length-1;
		while(i<j) {
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = arr[i];
		i++;
		j--;
		
		System.out.println("reverce order..........");
		for(int ele : arr) {
			System.out.println(ele);

		}
		
	}
	

	}

}

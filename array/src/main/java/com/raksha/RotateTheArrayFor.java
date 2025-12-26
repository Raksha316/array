package com.raksha;

public class RotateTheArrayFor {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
        System.out.println("printing the array................");
		
		for(int ele:arr) {
			System.out.println(ele);
			
		}
		
		for(int i=0; i<arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[i];
			arr[i]= arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		
		System.out.println("revesered array...................");
		for(int n : arr) {
			System.out.println(n+" ");
		
	}
	

	}

}

package com.raksha;
import java.util.Scanner;
public class C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("give the size of the array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i = 0; i<size; i++) {
			System.out.println("give" +i+ "element");
			arr[i] = sc.nextInt();
		}
		System.out.println("give the element to find");
		int element = sc.nextInt();
		int flag = 0;
		
		for(int i = 0; i<size; i++) {
		    if(arr[i] == element) {
			flag = 1;
			System.out.println("element found at index" + i);
		}
		}
	
	if (flag == 0) {
		System.out.println("element not found ");
	}

}
}

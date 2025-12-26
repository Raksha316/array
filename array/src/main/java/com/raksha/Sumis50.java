package com.raksha;
public class Sumis50 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 50;

        boolean flag = false;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
            	
                if(arr[i] + arr[j] == target) {
                    System.out.println("Index: " + i + " and " + j);
                    System.out.println("Values: " + arr[i] + " + " + arr[j] + " = 50");
                    flag = true;
                }
            }
        }

        if (flag == true) {
    		System.out.println("pair found..........");
    	}
    	else {
    		System.out.println(" pair not found.............");
    	}    }
}

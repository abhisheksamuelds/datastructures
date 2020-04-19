package com.array;

public class OneDArray {
	int arr[];
	
	//Time Complexity O(1)
	public  OneDArray(int size){
		arr = new int[size];
		for(int i = 0; i < arr.length ; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
		
	}
	
	//Time Complexity O(1)
	public void insert(int value){
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i] == Integer.MIN_VALUE){
				arr[i] = value;
				return;
			}
		}
		System.out.println("Array is full");
	}
	
	//Time Complexity O(1)
	public void access(int location){
		if(location > arr.length || location < 0){
			System.out.println("Index out of bounds");
		}
		else {
			System.out.println(arr[location]);
		}
	}
	
	//Time Complexity O(n)
	public void search(int number){
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i] == number){
				System.out.println("Number found");
				return;
			}
		}
		System.out.println("Number not found");
	}
	
	//Time Complexity O(n)
	public void traverse(){
		for(int i = 0; i < arr.length ; i++) {
			System.out.print(arr[i]+" ");

		}
		System.out.println();
	}
	
	//Time Complexity O(1)
	public void delete(int number){
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i] == number){
				arr[i] = Integer.MIN_VALUE;
				return;
			}
		}
		System.out.println("Number not found");
	}
	
	//Time Complexity O(1)
	public void deleteArray(){
		arr = null;
	}

}

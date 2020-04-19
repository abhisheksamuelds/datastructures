package com.array;

public class TwoDArray {
	int arr[][];
	
	//Time Complexity O(1)
	public TwoDArray(int rows, int columns){
		arr = new int[rows][columns];
	}
	
	//Time Complexity O(1)
	public void insert(int number, int row, int column){
		arr[row][column] = number;
	}
	
	//Time Complexity O(1)
	public void access(int row, int column){
		System.out.println(arr[row][column]);
	}
	
	//Time Complexity O(n)	
	public void search(int number){
		for(int i = 0;i < arr.length; i++){
			for(int j = 0;j < arr[i].length; j++){
				if(arr[i][j] == number){
					System.out.println("Number Found");
					return;
				}
			}
		}
		System.out.println("Number not found");
	}
	
	//Time Complexity O(n)
	public void traverse(){
		for(int i = 0;i < arr.length; i++){
			for(int j = 0;j < arr[i].length; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	//Time Complexity O(1)
	public void delete(int row, int column){
		arr[row][column] = 0;
	}
	
	//Time Complexity O(1)
	public void deleteArray(){
		arr = null;
	}
	

}

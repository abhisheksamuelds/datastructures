package com.recursion;

public class Fibonacci {

	//Time Complexity O(n)
	public int fib(int n){
		
		if(n == 1){
			return 0;
		}
		else if(n == 2){
			return 1;
		}
		return fib(n - 1)+ fib(n - 2);
		
	}
}

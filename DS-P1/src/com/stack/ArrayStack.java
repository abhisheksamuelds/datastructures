package com.stack;

public class ArrayStack {
	int stack[];
	int topOfStack=0;
	
	public void create(int size){
		stack = new int[size];
	}
	
	public void push(int value){
		if(!isFull()){
			stack[topOfStack++]= value;
		}
		else {
			System.out.println("STACK FULL");
		}
	}
	
	public void pop(){
		if(!isEmpty()){
			stack[--topOfStack]=Integer.MIN_VALUE;
		}
		else {
			System.out.println("STACK IS EMPTY");
		}

	}
	
	public void peep(){
		if(stack == null){
			System.out.println("STACK IS DELETED");
			return;
		}
		if(!isEmpty()){
			System.out.println(stack[topOfStack-1]);
		}
		else {
			System.out.println("STACK IS EMPTY");
		}
	}
	
	public boolean isEmpty(){
		return topOfStack == 0;
	}
	
	public boolean isFull(){
		return topOfStack >= stack.length;
	}
	
	public void delete(){
		stack = null;
	}

}

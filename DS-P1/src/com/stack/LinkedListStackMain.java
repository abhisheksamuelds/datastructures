package com.stack;

public class LinkedListStackMain {
	public static void main(String[] args) {
		LinkedListStack linkStack = new LinkedListStack();
		linkStack.create(5);
		linkStack.push(10);
		linkStack.push(12);
		linkStack.peep();
		linkStack.pop();
		linkStack.pop();
		linkStack.pop();
		linkStack.peep();
		linkStack.delete();
		linkStack.peep();
	}

}

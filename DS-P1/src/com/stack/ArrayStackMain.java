package com.stack;

public class ArrayStackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStack arrayStack = new ArrayStack();
		arrayStack.create(4);
		arrayStack.push(5);
		arrayStack.push(3);
		arrayStack.push(2);
		arrayStack.push(12);
		arrayStack.peep();
		arrayStack.push(15);
		arrayStack.pop();
		arrayStack.peep();
		arrayStack.pop();
		arrayStack.pop();
		arrayStack.pop();
		arrayStack.pop();
		arrayStack.peep();
		arrayStack.delete();
		arrayStack.peep();
	}

}

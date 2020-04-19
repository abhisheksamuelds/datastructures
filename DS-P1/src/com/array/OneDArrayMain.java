package com.array;

public class OneDArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OneDArray one = new OneDArray(5);
		one.insert(12);
		one.insert(15);
		one.insert(23);
		one.insert(56);
		one.insert(78);
		one.traverse();
		one.insert(34);
		one.access(3);
		one.search(23);
		one.delete(56);
		one.traverse();
		one.deleteArray();
		

	}

}

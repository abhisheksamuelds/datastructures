package com.array;

public class TwoDArrayMain {

	public static void main(String[] args) {
		TwoDArray two = new TwoDArray(5,5);
		two.insert(23, 1, 1);
		two.insert(13, 3, 2);
		two.traverse();
		two.access(3, 2);
		two.search(13);
		two.delete(3, 2);
		two.traverse();
		two.deleteArray();

	}

}

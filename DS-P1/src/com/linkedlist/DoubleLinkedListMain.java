package com.linkedlist;

public class DoubleLinkedListMain {

	public static void main(String[] args) {
		DoubleLinkedList dbl = new DoubleLinkedList();
		dbl.createDoubleLinkedList(10);
		dbl.traverse();
		dbl.insert(15, 0);
		dbl.insert(30, 5);
		dbl.insert(45, 5);
		dbl.traverse();
		dbl.insert(25, 1);
		dbl.traverse();
		dbl.search(30);
		dbl.search(23);
		dbl.delete(0);
		dbl.traverse();
		dbl.delete(6);
		dbl.traverse();
		dbl.delete(1);
		dbl.traverse();
		dbl.deleteDoubleLinkedList();
		dbl.traverse();

	}

}

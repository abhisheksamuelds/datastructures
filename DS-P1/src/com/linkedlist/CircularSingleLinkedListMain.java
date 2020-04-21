package com.linkedlist;

public class CircularSingleLinkedListMain {
	
	public static void main(String[] args){
		CircularSingleLinkedList csingle = new CircularSingleLinkedList();
		csingle.createCircularSingleLinkedList(10);
		csingle.traverse();
		csingle.insert(15, 0);
		csingle.insert(30, 5);
		csingle.insert(45, 5);
		csingle.traverse();
		csingle.insert(25, 1);
		csingle.traverse();
		csingle.search(45);
		csingle.search(20);
		csingle.delete(0);
		csingle.traverse();
		csingle.delete(6);
		csingle.traverse();
		csingle.delete(1);
		csingle.traverse();
		csingle.deleteCircularSingleLinkedList();
		csingle.traverse();
	}

}

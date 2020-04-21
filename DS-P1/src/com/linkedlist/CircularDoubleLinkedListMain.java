package com.linkedlist;

public class CircularDoubleLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularDoubleLinkedList cdouble = new CircularDoubleLinkedList();
		cdouble.createCircularDoubleLinkedList(10);
		cdouble.traverse();
		cdouble.insert(15, 0);
		cdouble.insert(30, 6);
		cdouble.insert(45, 6);
		cdouble.insert(25, 1);
		cdouble.traverse();
		cdouble.search(45);
		cdouble.search(20);
		cdouble.delete(0);
		cdouble.traverse();
		cdouble.delete(6);
		cdouble.traverse();
		cdouble.delete(1);
		cdouble.traverse();
		cdouble.deleteCircularDoubleLinkedList();
		cdouble.traverse();
		
	}
	


}

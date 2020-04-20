package com.linkedlist;

public class SingleLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList sll = new SingleLinkedList();
		sll.creteEmptyLinkedList(10);
		sll.traverse();
		sll.insert(15, 0);
		sll.insert(30, 5);
		sll.insert(45, 5);
		sll.traverse();
		sll.insert(25, 2);
		sll.traverse();
		sll.delete(0);
		sll.traverse();
		sll.delete(5);
		sll.traverse();
		sll.delete(1);
		sll.traverse();
		sll.deleteLinkedList();
		sll.traverse();

	}

}

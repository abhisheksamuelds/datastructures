package com.queue;

import com.linkedlist.SingleNode;

public class LinkedListQueue {
	private SingleNode head;
	private SingleNode tail;
	private int size;
	public SingleNode getHead() {
		return head;
	}
	public void setHead(SingleNode head) {
		this.head = head;
	}
	public SingleNode getTail() {
		return tail;
	}
	public void setTail(SingleNode tail) {
		this.tail = tail;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	//Time Complexity O(1)
	public void create(){
		head = new SingleNode();
		tail = new SingleNode();
		size = 0;
		
	}
	
	//Time Complexity O(1)
	public void enqueue(int value){
		SingleNode newNode = new SingleNode();
		newNode.setValue(value);
		newNode.setNext(null);
		if(isEmpty()){
			head = tail = newNode;
		}
		else {
			SingleNode lastNode = new SingleNode();
			lastNode = tail;
			lastNode.setNext(newNode);
			tail = newNode;
		}
		System.out.println("Enqueued: "+value);
		setSize(getSize() + 1);
		
	}
	
	//Time Complexity O(1)
	public void dequeue(){
		if(head == null){
			System.out.println("Queue is deleted");
			return;
		}
		if(isEmpty()){
			System.out.println("Queue is empty");
			return;
		}
		SingleNode tmpNode = new SingleNode();
		tmpNode = head;
		head = tmpNode.getNext();
		System.out.println("Dequeued: "+tmpNode.getValue());
		setSize(getSize() - 1);
		
	}
	
	//Time Complexity O(1)
	public boolean isEmpty(){
		return getSize() == 0;
	}
	
	//Time Complexity O(1)
	public void delete(){
		head = tail = null;
	}
}

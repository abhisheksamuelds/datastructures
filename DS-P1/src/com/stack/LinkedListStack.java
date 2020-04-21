package com.stack;

import com.linkedlist.SingleNode;

public class LinkedListStack {
	private SingleNode head;
	private SingleNode tail;
	private int size =0;
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
	public void create(int value){
		head = new SingleNode();
		tail = new SingleNode();
		SingleNode newNode = new SingleNode();
		newNode.setValue(value);
		newNode.setNext(null);
		head = tail = newNode;
		setSize(getSize() + 1);
	}
	
	//Time Complexity O(1)
	public void push(int value){
		if(head != null){
			SingleNode newNode = new SingleNode();
			newNode.setValue(value);
			newNode.setNext(null);
			SingleNode lastNode = new SingleNode();
			lastNode = tail;
			lastNode.setNext(newNode);
			tail = newNode;
			setSize(getSize() + 1);
		}
		else{
			System.out.println("STACK IS DELETED");
		}
	}
	
	//Time Complexity O(n)
	public void pop(){
		if(getSize() == 0){
			System.out.println("Stack is empty");
			return;
		}
		if(head != null){
			SingleNode tmpNode = new SingleNode();
			tmpNode = head;
			
			for(int i =1;i<getSize()-1;i++){
				tmpNode = tmpNode.getNext();
			}
			tmpNode.setNext(null);
			tail = tmpNode;
			setSize(getSize() - 1);
		}
		else{
			System.out.println("STACK IS DELETED");
		}
		
	}
	
	//Time Complexity O(1)
	public void peep(){
		if(getSize() == 0){
			System.out.println("Stack is empty");
			return;
		}
		if(head != null){
			SingleNode lastNode = new SingleNode();
			lastNode = tail;
			System.out.println(lastNode.getValue());
		}
		else{
			System.out.println("STACK IS DELETED");
		}
	}
	
	//Time Complexity O(1)
	public void delete(){
		head = tail = null;
	}
	

}

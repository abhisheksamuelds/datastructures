package com.linkedlist;

public class CircularSingleLinkedList {
	private SingleNode head;
	private SingleNode tail;
	private int size = 0;
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
	
	//Time complexity O(1)
	public void createCircularSingleLinkedList(int value){
		head = new SingleNode();
		tail = new SingleNode();
		
		SingleNode newNode = new SingleNode();
		newNode.setValue(value);
		newNode.setNext(newNode);
		head = newNode;
		tail = newNode;
		setSize(getSize() + 1);
	}
	
	//Time complexity O(n)
	public void insert(int value, int location){
		if(location == 0){
			SingleNode newNode = new SingleNode();
			SingleNode lastNode = new SingleNode();
			newNode.setValue(value);
			newNode.setNext(head);
			head = newNode;
			lastNode = tail;
			lastNode.setNext(newNode);
			
		}
		else if(location > getSize()){
			SingleNode newNode = new SingleNode();
			SingleNode lastNode = new SingleNode();
			newNode.setValue(value);
			lastNode = tail;
			lastNode.setNext(newNode);
			newNode.setNext(head);
			tail = newNode;				
		}	
		else {
			SingleNode newNode = new SingleNode();
			SingleNode previousNode = new SingleNode();
			newNode.setValue(value);
			previousNode = head;
			for(int i = 0;i < location;i++){
				previousNode = previousNode.getNext();
			}
			SingleNode nextNode = new SingleNode();
			nextNode = previousNode.getNext();
			previousNode.setNext(newNode);
			newNode.setNext(nextNode);
		}
		setSize(getSize() + 1);
	}
	
	//Time complexity O(n)
	public void traverse(){
		if(!isLinkedListEmpty()){
			System.out.println("Linked List is Empty");
			return;
		}
		SingleNode tempNode = new SingleNode();
		tempNode = head;
		for(int i = 0;i< getSize();i++){
			System.out.print(tempNode.getValue());
			tempNode = tempNode.getNext();
			if(i != getSize() -1){
				System.out.print("->");
			}
		}
		System.out.println();
	}
	
	//Time complexity O(n)
	public void delete(int location){
		if(! isLinkedListEmpty()){
			System.out.println("Linked List is Empty");
			return;
		}
		if(location == 0){
			SingleNode tempNode = new SingleNode();
			SingleNode lastNode = new SingleNode();
			tempNode = head;
			head = tempNode.getNext();
			lastNode = tail;
			lastNode.setNext(tempNode.getNext());
			
		}
		else if(location > getSize()){
			SingleNode tempNode = new SingleNode();
			tempNode = head;
			for(int i = 0;i< getSize() - 1;i++){
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(head);
			tail = tempNode;
		}
		else {
			SingleNode prevNode = new SingleNode();
			SingleNode nextNode = new SingleNode();
			prevNode = head;
			for(int i =0;i < location -1; i++){
				prevNode = prevNode.getNext();
			}
			nextNode = prevNode.getNext().getNext();
			prevNode.setNext(nextNode);
		}
		setSize(getSize() - 1);
	}
	
	//Time complexity O(1)
	public void deleteCircularSingleLinkedList() {
		head = tail = null;
	}
	
	public boolean isLinkedListEmpty(){
		return head != null;
	}
	
	//Time complexity O(n)
	public void search(int value){
		if(! isLinkedListEmpty()){
			System.out.println("Linked List is Empty");
			return;
		}
		SingleNode tempNode = new SingleNode();
		tempNode = head;
		for(int i =0;i<getSize();i++){
			if(tempNode.getValue() == value){
				System.out.println("Number found at location: "+i);
				return;
			}
			tempNode = tempNode.getNext();
		}
		System.out.println("Number not found");
		
	}
}

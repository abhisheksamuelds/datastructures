package com.linkedlist;

public class CircularDoubleLinkedList {
	private DoubleNode head;
	private DoubleNode tail;
	private int size = 0;
	public DoubleNode getHead() {
		return head;
	}
	public void setHead(DoubleNode head) {
		this.head = head;
	}
	public DoubleNode getTail() {
		return tail;
	}
	public void setTail(DoubleNode tail) {
		this.tail = tail;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	//Time Complexity - O(1)
	public void createCircularDoubleLinkedList(int value){
		head = new DoubleNode();
		tail = new DoubleNode();
		
		DoubleNode newNode = new DoubleNode();
		newNode.setValue(value);
		newNode.setNext(newNode);
		newNode.setPrev(newNode);
		head = newNode;
		tail = newNode;
		setSize(getSize() + 1);
	}
	
	//Time Complexity - O(n)
	public void insert(int value, int location){
		if(location == 0){
			DoubleNode newNode = new DoubleNode();
			DoubleNode firstNode = new DoubleNode();
			DoubleNode lastNode = new DoubleNode();
			firstNode = head;
			lastNode = tail;
			
			newNode.setValue(value);
			newNode.setNext(firstNode);
			newNode.setPrev(lastNode);
			
			firstNode.setPrev(newNode);
			
			lastNode.setNext(newNode);
			
			head = newNode;
			
		}
		else if(location > getSize()){
			DoubleNode newNode = new DoubleNode();
			DoubleNode lastNode = new DoubleNode();
			DoubleNode firstNode = new DoubleNode();
			firstNode = head;
			lastNode = tail;
			
			newNode.setValue(value);
			newNode.setNext(firstNode);
			newNode.setPrev(lastNode);
			
			firstNode.setPrev(newNode);
			
			lastNode.setNext(newNode);
			
			tail = newNode;
		}
		else {
			DoubleNode newNode = new DoubleNode();
			DoubleNode prevNode = new DoubleNode();
			DoubleNode nextNode = new DoubleNode();
			
			prevNode = head;
			for(int i =0;i<location;i++){
				prevNode = prevNode.getNext();
			}
			nextNode = prevNode.getNext();
			
			newNode.setValue(value);
			newNode.setPrev(prevNode);
			newNode.setNext(nextNode);
			
			prevNode.setNext(newNode);
			
			nextNode.setPrev(newNode);
		}
		setSize(getSize()+1);
	}
	
	//Time Complexity - O(n)
	public void traverse(){
		if(! isEmpty()){
			System.out.println("Linked List is empty");
			return;
		}
		DoubleNode tmpNode = new DoubleNode();
		tmpNode = head;
		for(int i =0;i< getSize();i++){
			System.out.print(tmpNode.getValue());
			if(i != getSize() - 1){
				System.out.print("<->");
			}
			tmpNode = tmpNode.getNext();
		}
		System.out.println();
	}
	
	public void delete(int location){
		if(! isEmpty()){
			System.out.println("Linked List is empty");
			return;
		}
		if(location == 0){
			DoubleNode tmpNode = new DoubleNode();
			DoubleNode firstNode = new DoubleNode();
			DoubleNode lastNode = new DoubleNode();
			firstNode = head;
			lastNode = tail;
			tmpNode = firstNode.getNext();
			tmpNode.setPrev(lastNode);
			lastNode.setNext(tmpNode);
			head = tmpNode;
			firstNode.setPrev(null);
		}
		else if(location > getSize()){
			DoubleNode tmpNode = new DoubleNode();
			DoubleNode firstNode = new DoubleNode();
			DoubleNode lastNode = new DoubleNode();
			firstNode = head;
			lastNode = tail;
			tmpNode = lastNode.getPrev();
			tmpNode.setNext(firstNode);
			
			firstNode.setPrev(tmpNode);
			tail = tmpNode;
			lastNode.setPrev(null);
		}
		else {
			DoubleNode tmpNode = new DoubleNode();
			DoubleNode prevNode = new DoubleNode();
			DoubleNode nextNode = new DoubleNode();
			tmpNode = head;
			for(int i =0;i<location;i++){
				tmpNode = tmpNode.getNext();
			}
			nextNode = tmpNode.getNext();
			prevNode = tmpNode.getPrev();
			prevNode.setNext(nextNode);
			nextNode.setPrev(prevNode);
			tmpNode.setPrev(null);
			
		}
		setSize(getSize() - 1);
	}
	
	//Time Complexity - O(n)
	public void deleteCircularDoubleLinkedList(){
		DoubleNode tmpNode = new DoubleNode();
		tmpNode =head;
		for(int i =0;i<getSize();i++){
			tmpNode.setPrev(null);
			tmpNode = tmpNode.getNext();
		}
		head=tail=null;
	}
	
	public boolean isEmpty(){
		return head != null;
	}
	
	//Time Complexity - O(n)
	public void search(int value){
		if(! isEmpty()){
			System.out.println("Linked List is empty");
			return;
		}
		DoubleNode tmpNode = new DoubleNode();
		tmpNode = head;
		for(int i =0;i< getSize();i++){
			if(tmpNode.getValue() == value){
				System.out.println("Value found at: "+i);
				return;
			}
			tmpNode = tmpNode.getNext();
		}
		System.out.println("Value not found");
	}

}

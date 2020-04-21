package com.linkedlist;

public class DoubleLinkedList {
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
	
	//Time Complexity O(1)
	public void createDoubleLinkedList(int value){
		head = new DoubleNode();
		tail = new DoubleNode();
		DoubleNode newNode = new DoubleNode();
		newNode.setValue(value);
		newNode.setNext(null);
		newNode.setPrev(null);
		head = newNode;
		tail = newNode;
		setSize(getSize() + 1);
	}
	
	//Time Complexity O(n)
	public void insert(int value, int location){
		if(location == 0){
			DoubleNode newNode = new DoubleNode();
			DoubleNode nextNode = new DoubleNode();
			nextNode = head;
			newNode.setValue(value);
			newNode.setPrev(null);
			newNode.setNext(head);
			nextNode.setPrev(newNode);
			head = newNode;	
		}
		else if(location > getSize()){
			DoubleNode newNode = new DoubleNode();
			DoubleNode prevNode = new DoubleNode();
			prevNode = tail;
			newNode.setValue(value);
			newNode.setNext(null);
			newNode.setPrev(prevNode);
			prevNode.setNext(newNode);
			tail = newNode;
		}
		else {
			DoubleNode newNode = new DoubleNode();
			newNode.setValue(value);
			DoubleNode prevNode = new DoubleNode();
			DoubleNode nextNode = new DoubleNode();
			prevNode = head;
			for(int i = 0;i < location;i++){
				prevNode = prevNode.getNext();
			}
			nextNode = prevNode.getNext();
			prevNode.setNext(newNode);
			nextNode.setPrev(newNode);
			newNode.setNext(nextNode);
			newNode.setPrev(prevNode);
		}
		setSize(getSize() + 1);
	}
	
	//Time Complexity O(n)
	public void traverse(){
		if(!isEmpty()){
			System.out.println("Linked List is empty");
			return;
		}
		DoubleNode tmpNode = new DoubleNode();
		tmpNode = head;
		for(int i =0;i<getSize();i++){
			System.out.print(tmpNode.getValue());
			if(i != getSize()-1){
				System.out.print("<->");
			}
			tmpNode = tmpNode.getNext();
		}
		System.out.println();
	}
	
	//Time Complexity O(n)
	public void delete(int location){
		if(!isEmpty()){
			System.out.println("Linked List is empty");
			return;
		}
		if(location == 0){
			DoubleNode tmpNode = new DoubleNode();
			tmpNode = head;
			head = tmpNode.getNext();
		}
		else if(location > getSize()){
			DoubleNode tmpNode = new DoubleNode();
			tmpNode = tail;
			tmpNode.getPrev().setNext(null);
			tail = tmpNode.getPrev();
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
	
	//Time Complexity O(n)
	public void deleteDoubleLinkedList(){
		DoubleNode tmpNode = new DoubleNode();
		tmpNode = head;
		for(int i =0;i<getSize();i++){
			tmpNode.setPrev(null);
			tmpNode = tmpNode.getNext();
		}
		head = tail = null;
	}
	
	public boolean isEmpty(){
		return head != null;
	}
	
	//Time Complexity O(n)
	public void search(int value){
		if(!isEmpty()){
			System.out.println("Linked List is empty");
			return;
		}
		
		DoubleNode tmpNode = new DoubleNode();
		tmpNode = head;
		for(int i =0;i<getSize();i++){
			if(tmpNode.getValue() == value){
				System.out.println("Value found at: "+i);
				return;
			}
			tmpNode = tmpNode.getNext();
		}
		System.out.println("Value not found");
	}

}

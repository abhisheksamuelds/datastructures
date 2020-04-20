package com.linkedlist;

public class SingleLinkedList {
	private SingleNode head;
	private SingleNode tail;
	private int size = 0;
	
	public SingleNode getRoot() {
		return head;
	}

	public void setRoot(SingleNode root) {
		this.head = root;
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
	public void creteEmptyLinkedList(int value){
		head = new SingleNode();
		tail = new SingleNode();
		SingleNode newNode = new SingleNode();
		newNode.setValue(value);
		newNode.setNext(null);
		head = newNode;
		tail = newNode;
		setSize(getSize()+1);
	}
	
	//Time complexity O(n)
	public void insert(int value, int location){
		if(location == 0){
			SingleNode newNode = new SingleNode();
			newNode.setValue(value);
			newNode.setNext(head);
			head = newNode;
		}
		else if(location > getSize()){
			SingleNode newNode = new SingleNode();
			newNode.setValue(value);
			SingleNode prevNode = new SingleNode();
			newNode.setNext(null);
			prevNode = tail;
			prevNode.setNext(newNode);
			tail = newNode;
		}
		else {
			SingleNode newNode = new SingleNode();
			newNode.setValue(value);
			SingleNode prevNode = new SingleNode();
			SingleNode nextNode = new SingleNode();
			prevNode = head;
			for(int i = 0;i<location -1;i++){
				prevNode = prevNode.getNext();
			}
			nextNode = prevNode.getNext();
			prevNode.setNext(newNode);
			newNode.setNext(nextNode);
		}
		setSize(getSize() + 1);
	}

	//Time complexity O(n)
	public void traverse(){
		if(!isLinkedListEmpty()){
			System.out.println("Linked List is empty");
			return;
		}
		SingleNode tempNode = new SingleNode();
		tempNode = head;
		for(int i =0;i< getSize();i++){
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
		if(!isLinkedListEmpty()){
			System.out.println("Linked List is empty");
			return;
		}
		if(location == 0){
			SingleNode tempNode = new SingleNode();
			tempNode = head;
			head = tempNode.getNext();			
		}
		else if(location > getSize()){
			SingleNode tempNode = new SingleNode();
			tempNode = head;
			for(int i = 0;i < getSize() - 1;i++){
				tempNode = tempNode.getNext();
			}
			if(tempNode == head){
				head = tail = null;
			}
			else {
				tempNode.setNext(null);
				tail = tempNode;
			}
		}
		else {
			SingleNode previousNode = new SingleNode();
			SingleNode nextNode = new SingleNode();
			previousNode = head;
			
			for(int i = 0;i<location - 1;i++){
				previousNode = previousNode.getNext();
			}
			nextNode = previousNode.getNext().getNext();
			previousNode.setNext(nextNode);
			
		}
		setSize(getSize() - 1);
	}
	
	//Time complexity O(1)
	public void deleteLinkedList(){
		head = tail = null;
	}
	
	public boolean isLinkedListEmpty(){
		return head != null;
	}
}

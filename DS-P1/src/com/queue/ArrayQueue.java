package com.queue;

public class ArrayQueue {
	int queue[];
	int beginingOfQueue, endOfQueue;
	
	public void create(int size){
		queue = new int[size];
		beginingOfQueue = endOfQueue = -1;
	}
	
	public boolean isEmpty(){
		if(endOfQueue == -1){
			return true;
		}
		else if(beginingOfQueue >= endOfQueue){
			return true;
		}
		return false;
	}
	
	public boolean isFull(){
		if(endOfQueue == queue.length - 1){
			return true;
		}
		return false;
	}
	
	public void enQueue(int value){
		if(queue == null){
			System.out.println("Queue is deleted");
			return;
		}
		if(!isFull()){
			queue[++endOfQueue] = value;
			System.out.println("Enqueued: "+value);
		}
		else {
			System.out.println("Queue is full");
		}
	}
	
	public void deQueue(){
		if(queue == null){
			System.out.println("Queue is deleted");
			return;
		}
		if(!isEmpty()){
			System.out.println("Dequeued: "+queue[beginingOfQueue+1]);
			queue[++beginingOfQueue] = Integer.MIN_VALUE;
		}
		else {
			System.out.println("Queue is empty");
		}
	}
	
	public void delete(){
		queue = null;
	}
}

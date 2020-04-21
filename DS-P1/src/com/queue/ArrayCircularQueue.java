package com.queue;

public class ArrayCircularQueue {
	int queue[];
	int beginingOfQueue,endOfQueue;
	
	public void create(int size) {
		queue = new int[size];
		endOfQueue = -1;
		beginingOfQueue = 0;
	}
	public boolean isFull(){
		if(endOfQueue >= queue.length - 1 && beginingOfQueue <1){
			return true;
		}
		return false;
	}
	
	public boolean isEmpty(){
		if(beginingOfQueue == -1){
			return true;
		}
		return false;
	}
	
	public void enQueue(int value){
		if(isFull()){
			System.out.println("Queue is full");
		}
		else {
			queue[++endOfQueue] = value;
			System.out.println("Enqueued: "+value);
		}
	}
	
	public void deQueue(){
		if(isEmpty()){
			System.out.println("Queue is empty");
		}
		else{
			System.out.println("Dequeued: "+queue[beginingOfQueue]);
			queue[beginingOfQueue++] = Integer.MIN_VALUE;
			if(beginingOfQueue > queue.length - 1){
				beginingOfQueue = 0;
			}
			if(endOfQueue >= queue.length - 1 && beginingOfQueue > 0){
				endOfQueue = -1;
			}
			
		}
	}
	public void index(){
		System.out.println("Begining: "+beginingOfQueue+", End: "+endOfQueue);
	}
}

package com.queue;

public class LinkedListQueueMain {

	public static void main(String[] args) {
		LinkedListQueue llqueue = new LinkedListQueue();
		llqueue.create();
		llqueue.enqueue(23);
		llqueue.enqueue(45);
		llqueue.enqueue(65);
		llqueue.dequeue();
		llqueue.dequeue();
		llqueue.dequeue();
		llqueue.dequeue();
		llqueue.delete();

	}

}

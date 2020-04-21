package com.queue;

public class ArrayQueueMain {

	public static void main(String[] args) {
		ArrayQueue arrQueue = new ArrayQueue();
		arrQueue.create(3);
		arrQueue.enQueue(5);
		arrQueue.enQueue(6);
		arrQueue.enQueue(7);
		arrQueue.enQueue(8);
		arrQueue.deQueue();
		arrQueue.deQueue();
		arrQueue.deQueue();
		arrQueue.deQueue();
		arrQueue.delete();

	}

}

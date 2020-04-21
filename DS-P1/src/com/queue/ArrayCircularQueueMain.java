package com.queue;

public class ArrayCircularQueueMain {

	public static void main(String[] args) {
		ArrayCircularQueue acqueue = new ArrayCircularQueue();
		acqueue.create(4);
		acqueue.enQueue(5);
		acqueue.enQueue(6);
		acqueue.enQueue(7);
		acqueue.enQueue(8);
		acqueue.index();
		acqueue.enQueue(9);
		acqueue.deQueue();
		acqueue.index();
	    acqueue.enQueue(11);
	    acqueue.index();
	    acqueue.deQueue();
	    acqueue.deQueue();
	    acqueue.index();
	    acqueue.deQueue();
	    acqueue.index();
	    acqueue.enQueue(8);
	    acqueue.index();
	    acqueue.enQueue(9);
	    acqueue.index();
	    acqueue.deQueue();
	    acqueue.index();
	    acqueue.deQueue();
	    acqueue.deQueue();
	    acqueue.deQueue();
	}

}

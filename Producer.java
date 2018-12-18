package com.pre;

import java.util.List;

public class Producer implements Runnable{
	
	private final List<Integer> taskQueue;
	private final int MAX_CAPACITY;
	
	Producer(List<Integer> sharedQueue, int i){
		this.taskQueue = sharedQueue;
		this.MAX_CAPACITY = i;
	}

	@Override
	public void run() {
		int counter = 0;
		while(true)
		{
			try {
				produce(counter++);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void produce(int i) throws InterruptedException {
			synchronized(taskQueue) {
				while(taskQueue.size() == MAX_CAPACITY) {
					System.out.println("Queue is full " + Thread.currentThread().getName()
							+ " is waiting , size: " + taskQueue.size());
					taskQueue.wait();
				}
				Thread.sleep(1000);
				taskQueue.add(i);
				System.out.println("Produced " + i);
				taskQueue.notifyAll();
			}
	}

}

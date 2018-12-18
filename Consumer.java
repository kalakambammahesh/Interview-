package com.pre;

import java.util.List;

public class Consumer implements Runnable{
	
	private final List<Integer> taskQueue;
	private final int MAX_CAPACITY;
	
	Consumer(List<Integer> sharedQueue, int i){
		this.taskQueue = sharedQueue;
		this.MAX_CAPACITY = i;
	}

	@Override
	public void run() {
		while(true) {
			try {
				consumer();
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	private void consumer() throws InterruptedException{
		synchronized(taskQueue) {
			while(taskQueue.isEmpty()) {
				System.out.println("Queue is empty " + Thread.currentThread().getName() + " "
						+ "is waiting , size: " + taskQueue.size());
				taskQueue.wait();
			}
			
			Thread.sleep(1000);
			int i = taskQueue.remove(0);
			System.out.println("Consumed : " + i);
			taskQueue.notifyAll();
		}
	}
	
}

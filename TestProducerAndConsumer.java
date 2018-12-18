package com.pre;

import java.util.ArrayList;
import java.util.List;

public class TestProducerAndConsumer {

	public static void main(String[] args) {
		List<Integer> taskQueue = new ArrayList<>();
		Thread tProducer = new Thread(new Producer(taskQueue, 5), "Producer");
		Thread tConsumer = new Thread(new Consumer(taskQueue, 5), "Consumer");
		tProducer.start();
		tConsumer.start();
	}

}

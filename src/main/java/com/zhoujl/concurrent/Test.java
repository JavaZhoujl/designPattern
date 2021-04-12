package com.zhoujl.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * Description: 测试
 *
 * @Date: 2019年05月21日 上午 11:59
 * @author: zhoujl
 * @Version: 1.0
 */
public class Test extends Thread{

	private static CountDownLatch countDownLatch = new CountDownLatch (1);

	private BlockingQueueDemo blockingQueueDemo =new BlockingQueueDemo ();

	public static void main(String[] args) {

		for (int i = 0; i < 1000; i++) {
			new Test ().start ();
		}
		countDownLatch.countDown();
	}

	public void run() {
		try {
			countDownLatch.await(); //阻塞  n个线程 Thread.currentThread
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(Thread.currentThread().getName().contains ("10")) {
			blockingQueueDemo.put (Thread.currentThread().getName());
		}else if(Thread.currentThread().getName().contains ("7")) {
			System.out.println (blockingQueueDemo.take (9));
		}
	}
}

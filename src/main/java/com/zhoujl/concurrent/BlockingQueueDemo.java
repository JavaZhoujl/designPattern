package com.zhoujl.concurrent;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Description: 用ReentrantLock、Condition实现一个简单的阻塞队列
 * 阻塞队列提供两个方法，一个是put、一个是take
 *
 * @Date: 2019年05月21日 上午 10:54
 * @author: zhoujl
 * @Version: 1.0
 */
public class BlockingQueueDemo {

	private Lock lock;

	private Condition condition ;

	private static Object[] objs = new Object[10] ;


	private static final ThreadLocal<Integer> local = new ThreadLocal<Integer>();

	public BlockingQueueDemo() {
		this.lock = new ReentrantLock ();
		this.condition = lock.newCondition ();
	}

	public void put(Object obj) {
		if(obj == null) {
			new RuntimeException ("元素不能为null");
		}
		try{
			lock.lock ();
			boolean flag = false;
			for (int i = 0; i < 10; i++) {
				if(objs[i] == null) {
					objs[i] = obj;
					flag = true;
				}
			}
			if(flag) {
				System.err.println ("新增元素"+obj+"，唤醒等待中的线程。");
				condition.signal ();
			}else {
				try {
					System.err.println ("数组中元素已满，等待线程取走释放。"+objs[9]);
					condition.await ();
				} catch (InterruptedException e) {
					e.printStackTrace ();
				}
			}

		}finally {
			lock.unlock ();
		}
	}

	public Object take(int index) {
		Object obj;
		try{
			lock.lock ();
			if(objs[index]==null) {
				try {
					local.set (index);
					System.err.println ("该位置为null,等待添加元素。");
					condition.await ();
					System.err.println ("重试取值 index:"+ local.get ());
					take(local.get ());
				} catch (InterruptedException e) {
					e.printStackTrace ();
				}
			}
			obj = objs[index];
			Object[] newObjs = new Object[10] ;
			for(int i =0; i < 10; i++) {
				if(i== index) {
					newObjs [i] = null;
				}else {
					newObjs [i] = objs[i];
				}
			}
			objs = newObjs;
			condition.signal ();
		} finally {
			lock.unlock ();
		}
		return obj;
	}

}

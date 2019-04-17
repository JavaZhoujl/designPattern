package com.zhoujl.singleton;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @Author zhoujl
 * @Date 2019/4/17 16:54
 * @Version 1.0
 */
public class ConcurrentExecutor {

    /**
     * @param runHandler
     * @param executeCount 发起请求总数
     * @param concurrentCount 同时并发执行的线程数
     * @throws InterruptedException
     */
    public static void execute(final RunHandler runHandler, int executeCount, int concurrentCount) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        //控制信号量，此处用于控制并发的线程数
        final Semaphore semaphore = new Semaphore(concurrentCount);
        //闭锁，可实现计数量递减
        final CountDownLatch countDownLatch = new CountDownLatch(executeCount);
        for (int i = 0; i < executeCount; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        //执行此方法用于获取执行许可，当总计未释放的许可熟不超过executeCount时，
                        //则允许同性，否则线程阻塞等待，直到获取到许可
                        semaphore.acquire();
                        runHandler.handler();
                        //释放许可
                        semaphore.release();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    countDownLatch.countDown();
                }
            });
        }
        countDownLatch.await();
        executorService.shutdown();
    }

    public interface RunHandler {
        void handler();
    }
}

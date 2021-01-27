package com.company;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Downloaders extends Thread {
    private Semaphore semaphore;
    private CountDownLatch cdl;
    private int speedDownload = 100;
    private CountDownLatch cdu;

    public Downloaders(String name, Semaphore semaphore, CountDownLatch countDownLatch,
                       CountDownLatch countDownLatch1) {
        super(name);
        this.cdu = countDownLatch1;
        this.semaphore = semaphore;
        this.cdl = countDownLatch;
        start();
    }

    @Override
    public synchronized void run() {
        try {
            cdl.await();
            semaphore.acquire();
            System.out.println(getName() + " скачивает из сервера файл");
            sleep(500 / speedDownload*1000);

            System.out.println(getName() + " успешно скачал файл из сервера");
            cdu.countDown();
            semaphore.release();
        } catch (InterruptedException ignored) {
        }
    }
}
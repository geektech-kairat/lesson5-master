package com.company;

import java.util.concurrent.CountDownLatch;

public class Uploader extends Thread {
    private CountDownLatch cdl;
    private int sizeOfFile = 500;
    private int speedOfDownload =20;

    public Uploader(CountDownLatch countDownLatch) {
        this.cdl = countDownLatch;
        start();
    }

    @Override
    public synchronized void run() {
        System.out.println("Началась загрузка файла на сервер");
        try {
            System.out.println("_________*_________");
            sleep(sizeOfFile / speedOfDownload*100);
              System.out.println("_________*_________");
            sleep(sizeOfFile / speedOfDownload*100);
              System.out.println("_________*_________");
            sleep(sizeOfFile / speedOfDownload*100);
              System.out.println("_________*_________");
            sleep(sizeOfFile / speedOfDownload*100);
              System.out.println("_________*_________");
            sleep(sizeOfFile / speedOfDownload*100);
              System.out.println("_________*_________");
            sleep(sizeOfFile / speedOfDownload*100);
              System.out.println("_________*_________");
            sleep(sizeOfFile / speedOfDownload*100);
              System.out.println("_________*_________");
            sleep(sizeOfFile / speedOfDownload*100);
              System.out.println("_________*_________");
            sleep(sizeOfFile / speedOfDownload*100);
              System.out.println("_________*_________");
            sleep(sizeOfFile / speedOfDownload*100);


            System.out.println("Загрузка завершена!");
        } catch (InterruptedException ignored) {
        }
        cdl.countDown();
    }
}

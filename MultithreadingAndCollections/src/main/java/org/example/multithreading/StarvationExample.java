package org.example.multithreading;

public class StarvationExample {
    public static void main (String [] args) throws InterruptedException {

        WorkerThread highPriority = new WorkerThread("High Priority Thread", Thread.MAX_PRIORITY);
        WorkerThread lowPriority = new WorkerThread("Low Priority Thread",Thread.MIN_PRIORITY);

        highPriority.start();
        lowPriority.start();

        Thread.sleep(30000);

        highPriority.interrupt();
        lowPriority.interrupt();
    }
}

package org.example.multithreading;

public class ThreadExample {
    public static void main(String[] args){

        Thread thread = new Thread("New Thread") {
            public void run(){
                System.out.println("run by: " + getName());
            }
        };

        thread.start();
        System.out.println(thread.getName());

        Thread thread1 =  Thread.currentThread();
        String threadName = thread1.currentThread().getName();
        System.out.println("threadName" + threadName);

    }
}

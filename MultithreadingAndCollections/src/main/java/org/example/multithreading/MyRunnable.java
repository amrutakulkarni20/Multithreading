package org.example.multithreading;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("MyThread running using Runnable interface");
    }

    Runnable myRunnable = new Runnable(){
                public void run(){
                    System.out.println("Runnable running");
                }
            };

    Runnable runnable =
            () -> { System.out.println("Lambda Runnable running"); };
}

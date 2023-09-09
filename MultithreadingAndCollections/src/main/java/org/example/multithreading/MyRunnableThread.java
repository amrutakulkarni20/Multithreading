package org.example.multithreading;

public class MyRunnableThread {

    public static void main(String [] args){
        Thread thread1 = new Thread(new ThreadExample1(1, 10));
        Thread thread2 = new Thread(new ThreadExample1(1, 10));
        thread1.start();
        thread2.start();
    }


}

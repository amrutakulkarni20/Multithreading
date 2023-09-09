package org.example.multithreading;

public class ThreadDemo {
    public static void main(String [] args){
        ChildThread childThread = new ChildThread();
        childThread.start();
        for (int i = 0; i<10;i++){
            System.out.println(i+ " Main Thread ");
        }
    }
}

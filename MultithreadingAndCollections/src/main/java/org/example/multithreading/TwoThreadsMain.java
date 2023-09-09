package org.example.multithreading;

public class TwoThreadsMain {

    //public static final ThreadLocal<Integer> integerThreadLocal = new ThreadLocal<>();

    public static int integerThreadLocal = 0;

    private static class Thread1 extends Thread{
        public void run(){
            integerThreadLocal = 10;
            ClassOne.method1();
        }
    }
    private static class Thread2 extends Thread{
        public void run(){
            integerThreadLocal = 100;
            ClassOne.method1();
        }
    }

    public static void main(String[] args){
    Thread thread1 = new Thread1();
    thread1.setName("Thread1");
    thread1.start();

    Thread thread2 = new Thread2();
    thread2.setName("Thread2");
    thread2.start();
    }
}

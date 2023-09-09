package org.example.multithreading;

public class ThreadExample2 implements Runnable {

    private final int num1;
    private final int num2;

    public  ThreadExample2(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void run(){
        System.out.println("Odd numbers from 1 to 10");
        for (int i = num1; i <= num2; i++) {
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}

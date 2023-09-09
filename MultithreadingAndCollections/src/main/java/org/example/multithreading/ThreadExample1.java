package org.example.multithreading;

import java.util.ArrayList;
import java.util.List;

public class ThreadExample1 implements Runnable{

    private final int num1;
    private final int num2;

    public  ThreadExample1(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void run(){
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        for (int i = num1; i <= num2; i++) {
            if(i % 2 == 0){
                evenNumbers.add(i);
            }else{
                oddNumbers.add(i);
            }
        }
        System.out.println("Even numbers from 1 to 10" +evenNumbers);
        System.out.println("Odd numbers from 1 to 10"+oddNumbers);
    }

}

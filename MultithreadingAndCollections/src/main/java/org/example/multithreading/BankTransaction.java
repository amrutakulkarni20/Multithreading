package org.example.multithreading;

public class BankTransaction  {
    public static void main(String args []){
        BankAccount account = new BankAccount(1000.0);
        System.out.println("Thread name : "+ Thread.currentThread().getName());
       account.start();


    }
}

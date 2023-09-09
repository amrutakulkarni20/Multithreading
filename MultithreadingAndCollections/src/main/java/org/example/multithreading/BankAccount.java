package org.example.multithreading;

public class BankAccount extends Thread{

    private double balance;

    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    @Override
    public void run() {
        System.out.println("Thread name : "+ Thread.currentThread().getName());
    }

    public synchronized void deposit(double depositAmount){
        //1. check current deposit amount greater than 0
        //2. if yes then add deposit in balance
        if(depositAmount >= 0){
            this.balance += depositAmount;
            System.out.println("Deposited: " + depositAmount + " | New Balance: " + balance);
        }

    }

    public synchronized void withdraw(double withdrawAmount){
        //1. check current balance is not 0
        //2. check current balance is greater that equal to withdrawAmount
        if (balance >= 0 && balance >= withdrawAmount){
            this.balance -=withdrawAmount;
            System.out.println("Withdrawn: " + withdrawAmount + " | New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds to withdraw " + withdrawAmount);
        }
    }
}

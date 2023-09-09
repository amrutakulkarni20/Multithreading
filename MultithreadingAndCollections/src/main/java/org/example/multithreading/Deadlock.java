package org.example.multithreading;

public class Deadlock extends Thread{
    AClass a = new AClass();
    BClass b = new BClass();

    private void m1() throws InterruptedException {
        this.start();
        a.d1(b);
    }

    public void run(){
        try {
            b.d2(a);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String [] args) throws InterruptedException {

        Deadlock deadlock = new Deadlock();
        deadlock.m1();
    }


}

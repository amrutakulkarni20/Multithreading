package org.example.multithreading;

import java.net.StandardSocketOptions;

public class AClass {

    public  synchronized void d1(BClass b) throws InterruptedException {
        System.out.println("Thread 1 starts execution of d1()");
        Thread.sleep(3000);
        b.last();
    }

    public synchronized void last(){
        System.out.println("AClass's last method");
    }
}

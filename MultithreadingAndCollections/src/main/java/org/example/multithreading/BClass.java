package org.example.multithreading;

public class BClass {

    public  synchronized void d2(AClass a) throws InterruptedException {
        System.out.println("Thread 2 starts execution of d2()");
        Thread.sleep(3000);
        a.last();
    }

    public synchronized void last(){
        System.out.println("BClass's last method");
    }
}

package org.example.multithreading;

public class WorkerThread extends Thread{

    public WorkerThread(String name, int priority){
        super(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            System.out.println(getName() + " is executing.");
        }
        System.out.println(getName() + " has finished.");
    }
}

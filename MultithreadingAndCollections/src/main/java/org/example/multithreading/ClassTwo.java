package org.example.multithreading;

public class ClassTwo {
    public static void method2(){
        System.out.println(Thread.currentThread().getName()+ "ClassTwo method2 invoke");
        ClassThree.method3();
    }
}

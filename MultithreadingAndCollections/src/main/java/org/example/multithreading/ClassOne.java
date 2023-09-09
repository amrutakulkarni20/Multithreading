package org.example.multithreading;

import java.net.StandardSocketOptions;

public class ClassOne {
    public static void method1(){
        System.out.println(Thread.currentThread().getName()+ "ClassOne method1 invoke");
        ClassTwo.method2();
    }
}

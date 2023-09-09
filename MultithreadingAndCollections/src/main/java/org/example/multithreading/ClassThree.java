package org.example.multithreading;

import static org.example.multithreading.TwoThreadsMain.*;

public class ClassThree {
    public static void method3(){
        int value = integerThreadLocal;
        ++value;
        System.out.println(Thread.currentThread().getName()+ "ClassThree method3 invoke, Value is " + value );

    }
}

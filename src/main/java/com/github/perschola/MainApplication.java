package com.github.perschola;

public class MainApplication {
    public static void main(String[] args) {
        Runnable myObject = new MyObject();
        myObject.run();
        Thread thread1 = new Thread(new MyThread());
        Thread thread2= new Thread(new MyThread());
        thread1.start();
        thread2.start();
    }
}

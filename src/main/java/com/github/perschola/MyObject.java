package com.github.perschola;

public class MyObject implements Runnable {
    @Override
    public void run() {
        int count =1;

        try{
            while(count<4){
                Thread.sleep(2000);
                System.out.println("Name of Thread: "
                        + Thread.currentThread().getName());
                System.out.println("Thread priority is: "+Thread.currentThread().getPriority());
                System.out.println("================================================================");
                count++;
            }}catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    public void start(){

    }
}
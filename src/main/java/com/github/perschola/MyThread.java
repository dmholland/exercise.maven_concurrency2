package com.github.perschola;

public class MyThread implements Runnable{
    @Override
    public void run() {
        int count =1;
        try{

        while(count<6){
            Thread.sleep(2000);
            System.out.println(count);
            count++;
        }}catch(InterruptedException e){
            e.printStackTrace();
            }
        }
        public void start(){

        }
    }


package com.github.perschola;

import java.util.Date;

public class Waiter implements Runnable {
   private Message msg;

   Waiter(Message msg){
       this.msg=msg;
   }
    @Override
    public void run() {


            String thread=Thread.currentThread().getName();

    synchronized (msg){
        System.out.println(thread+" waiting to get notified at time : "+ new Date().getTime());
        try {
            msg.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread+" got notified at time : "+ new Date().getTime()+", "+thread+" processed: "+msg);
    }}

//    Overrides the run method. Inside the run method, first store the name of the current thread name in a variable name.
//    Then pass the member msg variable to a synchronized block Ex: synchronized(msg) { //...code here}.
       // Inside the block, print out the following: "[name] waiting to get notified at time: [current time in milliseconds]".
        // Then invoke the wait method of the msg member variable.
        // Finally print the following messages: "[name] waiter thread got notified at time: [current time in milliseconds]",
        // "[name] processed: [message from the Message class]"



}

package com.github.perschola;

import java.util.Date;

public class Notifier implements Runnable {
    private Message msg;

    Notifier(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String thread = Thread.currentThread().getName();

        synchronized (msg) {
            System.out.println(thread + " started: ");
            try {
                Thread.sleep(1000);

                synchronized (msg) {
                    msg.setMessage(thread + " is done");

                    System.out.println(thread + " done ");
                    msg.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

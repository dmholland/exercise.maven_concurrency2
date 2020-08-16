package com.github.perschola;

public class Account implements Runnable {
    static double amount=50.00;


    public synchronized void withdraw(double money){
        this.amount=this.amount-money;
    }

    @Override
    public void run() {
        while(true){
    try{
        Thread.sleep(100);
      if(amount-10.00>0)  {
          System.out.println(Thread.currentThread().getName()+" has started to withdraw.");
          withdraw(10.00);
          System.out.println(Thread.currentThread().getName()+" has finished withdrawing.");
      }
      else {
          System.out.println("There is not enough money");}
    }catch (InterruptedException e){
        e.printStackTrace();
    }}

    }
}

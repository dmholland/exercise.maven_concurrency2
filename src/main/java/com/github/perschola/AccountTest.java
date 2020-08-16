package com.github.perschola;



public class AccountTest{


        public void testRun() { // TODO
            Thread Reema = new Thread(new Account());
            Reema.setName("Reema");
            Thread Ranjeet= new Thread(new Account());
            Ranjeet.setName("Ranjeet");

        Reema.start();
        Ranjeet.start();

        }
}

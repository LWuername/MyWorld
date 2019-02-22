package com.runnable;

import org.junit.Test;

public class r1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello My Thread");
    }


    @Test
    public void s(){
//        Thread thread=new Thread(new r1());
//        thread.start();
        Thread thread=new Thread(runnable);
        thread.start();
    }

    Runnable runnable=new Runnable() {
        @Override
        public void run() {
            System.out.println("This is my;");
        }
    };

}

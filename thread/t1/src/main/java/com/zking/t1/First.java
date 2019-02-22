package com.zking.t1;

public class First extends  Thread {


    @Override
    public void run() {
        System.out.println("MyThread running");
    }

Thread thread=new Thread(){
    @Override
    public void run() {
        System.out.println("Hello My Thread");
    }
};

    public static void main(String[] args) {

    }

    public  void  a(){
        thread.start();
    }
}

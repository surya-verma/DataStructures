package com.slothnerds.threads;

public class HelloThread {
    static void main(String[] args) {
        HelloWorldThread thread = new HelloWorldThread();
        thread.start();
        HelloWorldThreadIntfc intfc = new HelloWorldThreadIntfc();
        Thread t1 = new Thread(intfc);
        t1.start();
    }
}



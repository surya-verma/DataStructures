package com.slothnerds.threads;

public class HelloWorldThreadIntfc implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World via Runnable!");
    }
}

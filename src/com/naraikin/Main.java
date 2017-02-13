package com.naraikin;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Counter counter = new Counter();
        Thread generator = new ThreadSecond(counter);
        Thread geter = new ThreadFiveSecond(counter);

        try {
            generator.join();
            geter.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

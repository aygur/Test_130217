package com.naraikin;

import java.util.Random;

/**
 * Created by dmitrii on 13.02.17.
 */
public class ThreadSecond extends Thread {

    Counter counter;
    public ThreadSecond(Counter ctr) {
        counter = ctr;
        this.start();
    }

    @Override
    public void run() {
        while (!counter.isFinish){
            try {
                Random random = new Random();
                Integer i = random.nextInt(1000);
                counter.addValue(i);
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

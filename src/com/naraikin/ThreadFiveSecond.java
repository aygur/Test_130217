package com.naraikin;

/**
 * Created by dmitrii on 13.02.17.
 */
public class ThreadFiveSecond extends Thread {

    Counter counter;
    public ThreadFiveSecond(Counter ctr) {
        counter = ctr;
        this.start();
    }

    @Override
    public void run() {
        do {
            try {
                Thread.sleep(5000);
                counter.printer();
                if (counter.isFinish){
                    System.out.println("Число " + counter.result
                            + " и более раз: " + counter.getValue(counter.result));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (!counter.isFinish);

    }
}

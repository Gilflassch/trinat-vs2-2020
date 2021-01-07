package ch.trinat.edu.threads02.übung6;

import java.time.Instant;

public class Runnable1 implements Runnable {

    private String name;

    public Runnable1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " " + Instant.now());
    }

}

package ch.trinat.edu.threads01.übung4;

public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            String name = Thread.currentThread().getName();
            System.out.println("Thread " + name + " has worked on number " + i);
        }
    }
}


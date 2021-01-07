package Threads01.ub5;

import kap02.kap0201.MyThread;

public class LambdaThread {

    public static void main(String[] args) {

        new Thread(() -> {
            System.out.println("Lambda");
            for (int i = 0; i < 50; i++) {
                String name = Thread.currentThread().getName();
                System.out.println("Thread " + name + " hat Nummer " + i + " verarbeitet");
            }
        }, "Lambda").start();
    }

}

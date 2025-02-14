package ch.trinat.edu.threads01.übung1;

public class TwoThreadsTest {
    public static void main(String[] args) {
        new SimpleThread("Monaco").start();
        new SimpleThread("Guenersey").start();
        System.out.println("main exits " + Thread.currentThread().toString());
    }
}

class SimpleThread extends Thread {
    public SimpleThread(String str) {
        super(str);
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + getName());
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
            }
        }
        System.out.println("DONE! " + getName());
    }
}
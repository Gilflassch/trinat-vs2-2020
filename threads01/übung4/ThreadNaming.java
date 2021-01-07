package ch.trinat.edu.threads01.übung4;

public class ThreadNaming {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());
        t1.setName("One");
        t2.setName("Two");
        t1.start();
        t2.start();
        System.out.println(Thread.currentThread().getName());

        new Thread(new MyThread(), "Three").start();
    }
}

package ch.trinat.edu.threads02.übung2;

import ch.trinat.edu.threads02.übung1.Semaphore;

class T1 extends Thread {
    private Semaphore[] sems;

    public T1(Semaphore[] sems, String name) {
        super(name);
        this.sems = sems;
        start();
    }

    private void a1() {
        System.out.println("a1");
    }

    public void run() {
        a1();
        sems[0].v();
        sems[1].v();
        sems[2].v();
    }
}
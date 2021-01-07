package ch.trinat.edu.threads02.übung2;

import ch.trinat.edu.threads02.übung1.Semaphore;

class T2 extends Thread {
    private Semaphore[] sems;

    public T2(Semaphore[] sems, String name) {
        super(name);
        this.sems = sems;
        start();
    }

    private void a2() {
        System.out.println("a2");
    }

    public void run() {
        sems[0].p();
        a2();
        sems[3].v();
    }
}
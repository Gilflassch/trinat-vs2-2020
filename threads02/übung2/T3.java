package ch.trinat.edu.threads02.übung2;

import ch.trinat.edu.threads02.übung1.Semaphore;

class T3 extends Thread {
    private Semaphore[] sems;

    public T3(Semaphore[] sems, String name) {
        super(name);
        this.sems = sems;
        start();
    }

    private void a3() {
        System.out.println("a3");
    }

    public void run() {
        sems[1].p();
        a3();
        sems[4].v();
    }
}
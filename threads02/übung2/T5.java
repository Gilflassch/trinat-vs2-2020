package ch.trinat.edu.threads02.übung2;

import ch.trinat.edu.threads02.übung1.Semaphore;

class T5 extends Thread {
    private Semaphore[] sems;

    public T5(Semaphore[] sems, String name) {
        super(name);
        this.sems = sems;
        start();
    }

    private void a5() {
        System.out.println("a5");
    }

    public void run() {
        sems[3].p();
        sems[4].p();
        sems[5].p();
        a5();
    }
}
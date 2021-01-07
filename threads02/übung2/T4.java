package ch.trinat.edu.threads02.übung2;

import ch.trinat.edu.threads02.übung1.Semaphore;

class T4 extends Thread {
    private Semaphore[] sems;

    public T4(Semaphore[] sems, String name) {
        super(name);
        this.sems = sems;
        start();
    }

    private void a4() {
        System.out.println("a4");
    }

    public void run() {
        sems[2].p();
        a4();
        sems[5].v();
    }
}
package ch.trinat.edu.threads01.übung9;


class StopThread extends Thread {
    private boolean stopped = false;

    public StopThread() {
        start();
    }
    public synchronized void stopThread() {
        stopped = true;
    }

    public synchronized boolean isStopped() {
        return stopped;
    }

    public void run() {
        int i = 0;
        while (!isStopped()) {
            i++;
            System.out.println("Hallo Welt (" + i + ")");
        }
        System.out.println("Thread stoppen");
    }
}

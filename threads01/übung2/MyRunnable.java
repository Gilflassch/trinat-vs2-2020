package ch.trinat.edu.threads01.übung2;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        go();
    }
    private void go() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        doMore();
    }
    private void doMore() {
        System.out.println("Up on the Stack");
    }
}

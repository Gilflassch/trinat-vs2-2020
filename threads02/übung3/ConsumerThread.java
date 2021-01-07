package ch.trinat.edu.threads02.übung3;

public class ConsumerThread extends Thread{

    private BufferN buffer;

    public ConsumerThread(String name, BufferN buffer){
        super(name);
        this.buffer = buffer;
    }

    @Override
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Buffer value: " +buffer.get());
    }
}

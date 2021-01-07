package ch.trinat.edu.threads02.übung3;

public class ProducerThread extends Thread{

    private BufferN buffer;

    public ProducerThread(String name, BufferN buffer) {
        super(name);
        this.buffer = buffer;
    }

    @Override
    public void run(){
        buffer.put((int)(Math.random()*100));
    }

}

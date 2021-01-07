package ch.trinat.edu.threads02.übung3;

import java.util.function.Consumer;

public class BufferTest {
    public static void main(String[] args) {
        BufferN buffer = new BufferN(10);
        ProducerThread Producer1 = new ProducerThread("Producer1", buffer);
        ProducerThread Producer2 = new ProducerThread("Producer2", buffer);
        ConsumerThread Consumer1 = new ConsumerThread("Consumer1", buffer);
        ConsumerThread Consumer2 = new ConsumerThread("Consumer2", buffer);

        Producer1.start();
        Producer2.start();

        Consumer1.start();
        Consumer2.start();


    }
}

package ch.trinat.edu.threads02.übung3;

import java.util.function.Consumer;

public class BufferTest {
    public static void main(String[] args) {
        BufferN buffer = new BufferN(10);
        ProducerThread ProducerA = new ProducerThread("ProducerA", buffer);
        ProducerThread ProducerB = new ProducerThread("ProducerB", buffer);
        ConsumerThread ConsumerA = new ConsumerThread("ConsumerA", buffer);
        ConsumerThread ConsumerB = new ConsumerThread("ConsumerB", buffer);

        ProducerA.start();
        ProducerB.start();

        ConsumerA.start();
        ConsumerB.start();


    }
}

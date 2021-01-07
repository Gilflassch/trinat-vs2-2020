package ch.trinat.edu.threads02.übung6;

import java.time.Instant;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecStart {

    public static void main(String[] args) {
        System.out.println("Start main: " + Instant.now());

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);
        Runnable1 r1 = new Runnable1("Start after 1 second");
        Runnable1 r2 = new Runnable1("Start after 2 seconds, then every 3 seconds. --> A");
        Runnable1 r3 = new Runnable1("Start after 3 seconds, then every 3 seconds.. ---> B");

        executor.schedule(r1, 1, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(r2, 2, 3, TimeUnit.SECONDS);
        executor.scheduleWithFixedDelay(r3, 3, 3, TimeUnit.SECONDS);
    }
}

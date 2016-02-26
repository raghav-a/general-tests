package general.tests.threadlocal;

import com.google.common.base.Stopwatch;

import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class ThreadLocalRandomTest {

  public static void main(String[] args) throws InterruptedException {
    ExecutorService executorService = Executors.newFixedThreadPool(10);

    Stopwatch stopwatch = Stopwatch.createStarted();

    while (stopwatch.elapsed(TimeUnit.MILLISECONDS) < 20)
      executorService.submit(() -> System.out.println(Thread.currentThread() + ":" + Math.abs(ThreadLocalRandom.current().nextInt())));

    System.exit(1);
  }
}

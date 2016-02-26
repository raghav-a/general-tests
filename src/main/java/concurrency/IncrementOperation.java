package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class IncrementOperation {


  int count = 0;

  void increment() {
    count = count + 1;
  }

  public void testIncrement() {
    ExecutorService executor = Executors.newFixedThreadPool(2);
    IntStream.range(0, 10000)
      .forEach(i -> executor.submit(this::increment));
    ConcurrentUtils.stop(executor);
    System.out.println(count);  // Diff value each time

  }

  public static void main(String[] args) {
    new IncrementOperation().testIncrement();
  }

}

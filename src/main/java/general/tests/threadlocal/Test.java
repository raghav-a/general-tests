package general.tests.threadlocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Test {

  public static void main(String[] args) {


    ExecutorService executorService = Executors.newFixedThreadPool(1, new ThreadFactory() {
      public Thread newThread(Runnable r) {
        return new MyThread();
      }
    });

    executorService.submit(new Runnable() {
      public void run() {
        //System.out.printf(ThreadLocal.);
      }
    });

  }


  private static class MyThread extends Thread {

    private static ThreadLocal<String> s = new ThreadLocal<String>(){
      @Override
      protected String initialValue() {
        return "hi";
      }
    };

  }
}

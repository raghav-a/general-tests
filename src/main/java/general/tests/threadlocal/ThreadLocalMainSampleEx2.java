package general.tests.threadlocal;

public class ThreadLocalMainSampleEx2 {

  public static void main(String[] args) {
    new Thread(new Runnable() {
      public void run() {
        ThreadContext threadContext = ThreadContext.get();
        threadContext.setTransactionId(1l);
        threadContext.setUserId("User 1");
        //here we call a method where the thread context is not passed as parameter
        PrintThreadContextValues.printThreadContextValues();
      }
    }).start();
    new Thread(new Runnable() {
      public void run() {
        ThreadContext threadContext = ThreadContext.get();
        threadContext.setTransactionId(2l);
        threadContext.setUserId("User 2");
        //here we call a method where the thread context is not passed as parameter
        PrintThreadContextValues.printThreadContextValues();
      }
    }).start();
  }
}

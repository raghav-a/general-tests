package general.tests.threadlocal;

public class PrintThreadContextValues {
  public static void printThreadContextValues(){
    System.out.println(ThreadContext.get());
  }
}

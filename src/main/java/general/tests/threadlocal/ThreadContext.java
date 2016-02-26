package general.tests.threadlocal;

public class ThreadContext {

  private String userId;
  private Long transactionId;

  private static ThreadLocal<ThreadContext> threadLocal = new ThreadLocal(){
    @Override
    protected ThreadContext initialValue() {
      return new ThreadContext();
    }

  };
  public static ThreadContext get() {


    return threadLocal.get();
  }
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }
  public Long getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }

  public String toString() {
    return "userId:" + userId + ",transactionId:" + transactionId;
  }
}


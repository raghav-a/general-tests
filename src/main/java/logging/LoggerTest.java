package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class LoggerTest {

  //slf4j - implementation log4j
  private static final Logger log = LoggerFactory.getLogger(LoggerTest.class);

  public static void main(String[] args) {

    MDC.put("first", "Dorothy");
    MDC.put("last", "Parker");

    log.info("Hello..log");

    MDC.clear();
  }


}

package com.polytech.bobet;

/**
 * @author bebo
 *
 */
public class CException extends Exception {

  // Attributes
  private static final long serialVersionUID = 1L;
  private static String sMessage;

  // Methods
  /**
   * @return sMessage
   */
  public static String getsMessage() {
    return sMessage;
  }

  /**
   * @param sMessage
   */
  public static void setsMessage(String sMessage) {
    CException.sMessage = sMessage;
  }

  // Constructors
  CException(String sMessage) {
    super(sMessage);
  }

}

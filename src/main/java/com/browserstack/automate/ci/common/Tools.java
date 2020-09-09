package com.browserstack.automate.ci.common;

import java.util.Arrays;

public class Tools {

  /**
   * Returns a string with only '*' of length equal to the length of the inputStr
   * 
   * @param strToMask
   * @return masked string
   */
  public static String maskString(String strToMask) {
    char[] maskChars = new char[strToMask.length()];
    Arrays.fill(maskChars, '*');
    return new String(maskChars);
  }

  /**
   * Returns human readable form
   * @param duration in seconds
   * @return
   */
  public static String durationToHumanReadable(long duration) {
    String result = "";
    int seconds = (int) duration % 60;
    duration /= 60;
    int minutes = (int) duration % 60;
    duration /= 60;
    int hours = (int) duration % 24;
    int days = (int) duration / 24;

    if (days == 0) {
      result = String.format("%02d h %02d m %02d s", hours, minutes, seconds);
    } else {
      result = String.format("%d d %02d h %02d m %02d s", days, hours, minutes, seconds);
    }
    return result;
  }
}

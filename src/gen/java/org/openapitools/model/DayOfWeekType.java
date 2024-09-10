package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * День недели:  * &#x60;MONDAY&#x60; — понедельник. * &#x60;TUESDAY&#x60; — вторник. * &#x60;WEDNESDAY&#x60; — среда. * &#x60;THURSDAY&#x60; — четверг. * &#x60;FRIDAY&#x60; — пятница. * &#x60;SATURDAY&#x60; — суббота. * &#x60;SUNDAY&#x60; — воскресенье. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * День недели:  * `MONDAY` — понедельник. * `TUESDAY` — вторник. * `WEDNESDAY` — среда. * `THURSDAY` — четверг. * `FRIDAY` — пятница. * `SATURDAY` — суббота. * `SUNDAY` — воскресенье. 
 */
public enum DayOfWeekType {
  
  MONDAY("MONDAY"),
  
  TUESDAY("TUESDAY"),
  
  WEDNESDAY("WEDNESDAY"),
  
  THURSDAY("THURSDAY"),
  
  FRIDAY("FRIDAY"),
  
  SATURDAY("SATURDAY"),
  
  SUNDAY("SUNDAY");

  private String value;

  DayOfWeekType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DayOfWeekType fromValue(String text) {
    for (DayOfWeekType b : DayOfWeekType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}



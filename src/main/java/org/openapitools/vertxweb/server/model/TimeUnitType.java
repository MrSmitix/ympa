package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Единица измерения времени:  * &#x60;HOUR&#x60; — час. * &#x60;DAY&#x60; — сутки. * &#x60;WEEK&#x60; — неделя. * &#x60;MONTH&#x60; — месяц. * &#x60;YEAR&#x60; — год. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Единица измерения времени:  * &#x60;HOUR&#x60; — час. * &#x60;DAY&#x60; — сутки. * &#x60;WEEK&#x60; — неделя. * &#x60;MONTH&#x60; — месяц. * &#x60;YEAR&#x60; — год. 
 */
public enum TimeUnitType {
  
  HOUR("HOUR"),
  
  DAY("DAY"),
  
  WEEK("WEEK"),
  
  MONTH("MONTH"),
  
  YEAR("YEAR");

  private String value;

  TimeUnitType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TimeUnitType fromValue(String value) {
    for (TimeUnitType b : TimeUnitType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
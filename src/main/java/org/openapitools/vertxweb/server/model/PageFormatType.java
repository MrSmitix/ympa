package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Размещение ярлыков на странице: * &#x60;A7&#x60; — в PDF-файле будут страницы формата близкому к A7. На каждой странице размещается ярлык размером 75 × 120 мм (80,4 × 125,6 мм с учетом полей). * &#x60;A4&#x60; — в PDF-файле будут страницы формата A4. На каждой странице размещаются восемь ярлыков размером 70,6 × 99,1 мм без полей. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Размещение ярлыков на странице: * &#x60;A7&#x60; — в PDF-файле будут страницы формата близкому к A7. На каждой странице размещается ярлык размером 75 × 120 мм (80,4 × 125,6 мм с учетом полей). * &#x60;A4&#x60; — в PDF-файле будут страницы формата A4. На каждой странице размещаются восемь ярлыков размером 70,6 × 99,1 мм без полей. 
 */
public enum PageFormatType {
  
  A7("A7"),
  
  A4("A4");

  private String value;

  PageFormatType(String value) {
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

  public static PageFormatType fromValue(String value) {
    for (PageFormatType b : PageFormatType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
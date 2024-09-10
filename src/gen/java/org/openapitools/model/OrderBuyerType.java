package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Тип покупателя:  * &#x60;PERSON&#x60; — физическое лицо.  * &#x60;BUSINESS&#x60; — организация. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Тип покупателя:  * `PERSON` — физическое лицо.  * `BUSINESS` — организация. 
 */
public enum OrderBuyerType {
  
  PERSON("PERSON"),
  
  BUSINESS("BUSINESS");

  private String value;

  OrderBuyerType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrderBuyerType fromValue(String text) {
    for (OrderBuyerType b : OrderBuyerType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}



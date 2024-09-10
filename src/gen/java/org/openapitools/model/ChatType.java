package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Тип чата:  * &#x60;CHAT&#x60; — чат с покупателем. * &#x60;ARBITRAGE&#x60; — спор. 
 */
public enum ChatType {
  
  CHAT("CHAT"),
  
  ARBITRAGE("ARBITRAGE");

  private String value;

  ChatType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ChatType fromValue(String value) {
    for (ChatType b : ChatType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}


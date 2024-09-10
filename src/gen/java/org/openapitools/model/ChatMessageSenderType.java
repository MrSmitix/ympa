package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Кто отправил сообщение:  * &#x60;PARTNER&#x60; — магазин. * &#x60;CUSTOMER&#x60; — покупатель. * &#x60;MARKET&#x60; — Маркет. * &#x60;SUPPORT&#x60; — сотрудник службы поддержки Маркета. 
 */
public enum ChatMessageSenderType {
  
  PARTNER("PARTNER"),
  
  CUSTOMER("CUSTOMER"),
  
  MARKET("MARKET"),
  
  SUPPORT("SUPPORT");

  private String value;

  ChatMessageSenderType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ChatMessageSenderType fromValue(String value) {
    for (ChatMessageSenderType b : ChatMessageSenderType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}


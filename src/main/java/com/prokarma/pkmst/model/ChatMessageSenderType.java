package com.prokarma.pkmst.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Кто отправил сообщение:  * `PARTNER` — магазин. * `CUSTOMER` — покупатель. * `MARKET` — Маркет. * `SUPPORT` — сотрудник службы поддержки Маркета. 
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
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ChatMessageSenderType fromValue(String text) {
    for (ChatMessageSenderType b : ChatMessageSenderType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


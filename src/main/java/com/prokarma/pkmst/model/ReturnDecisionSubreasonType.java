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
 * Детали причин возврата:   * `DO_NOT_FIT`:     * `USER_DID_NOT_LIKE` — товар не понравился.     * `USER_CHANGED_MIND` — передумал покупать.     * `DELIVERED_TOO_LONG` — длительный срок доставки, поэтому передумал.    * `BAD_QUALITY`:     * `BAD_PACKAGE` — упаковка товара была нарушена.     * `DAMAGED` — царапины, сколы.     * `NOT_WORKING` — не включается / не работает.     * `INCOMPLETENESS` — некомплект (не хватает детали в наборе, к товару).    * `WRONG_ITEM`:     * `WRONG_ITEM` — не тот товар.     * `WRONG_COLOR` — не соответствует по цвету.     * `DID_NOT_MATCH_DESCRIPTION` — не соответствует заявленным характеристикам/описанию. 
 */
public enum ReturnDecisionSubreasonType {
  
  USER_DID_NOT_LIKE("USER_DID_NOT_LIKE"),
  
  USER_CHANGED_MIND("USER_CHANGED_MIND"),
  
  DELIVERED_TOO_LONG("DELIVERED_TOO_LONG"),
  
  BAD_PACKAGE("BAD_PACKAGE"),
  
  DAMAGED("DAMAGED"),
  
  NOT_WORKING("NOT_WORKING"),
  
  INCOMPLETENESS("INCOMPLETENESS"),
  
  WRONG_ITEM("WRONG_ITEM"),
  
  WRONG_COLOR("WRONG_COLOR"),
  
  DID_NOT_MATCH_DESCRIPTION("DID_NOT_MATCH_DESCRIPTION"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReturnDecisionSubreasonType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ReturnDecisionSubreasonType fromValue(String text) {
    for (ReturnDecisionSubreasonType b : ReturnDecisionSubreasonType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


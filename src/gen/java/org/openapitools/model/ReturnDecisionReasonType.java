package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Причины возврата:  * &#x60;BAD_QUALITY&#x60; — бракованный товар (есть недостатки).  * &#x60;DO_NOT_FIT&#x60; — товар не подошел.  * &#x60;WRONG_ITEM&#x60; — привезли не тот товар.  * &#x60;DAMAGE_DELIVERY&#x60; — товар поврежден при доставке.  * &#x60;LOYALTY_FAIL&#x60; — невозможно установить виновного в браке/пересорте.  * &#x60;CONTENT_FAIL&#x60; — ошибочное описание товара по вине Маркета.  * &#x60;UNKNOWN&#x60; — причина не известна. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Причины возврата:  * `BAD_QUALITY` — бракованный товар (есть недостатки).  * `DO_NOT_FIT` — товар не подошел.  * `WRONG_ITEM` — привезли не тот товар.  * `DAMAGE_DELIVERY` — товар поврежден при доставке.  * `LOYALTY_FAIL` — невозможно установить виновного в браке/пересорте.  * `CONTENT_FAIL` — ошибочное описание товара по вине Маркета.  * `UNKNOWN` — причина не известна. 
 */
public enum ReturnDecisionReasonType {
  
  BAD_QUALITY("BAD_QUALITY"),
  
  DOES_NOT_FIT("DOES_NOT_FIT"),
  
  WRONG_ITEM("WRONG_ITEM"),
  
  DAMAGE_DELIVERY("DAMAGE_DELIVERY"),
  
  LOYALTY_FAIL("LOYALTY_FAIL"),
  
  CONTENT_FAIL("CONTENT_FAIL"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReturnDecisionReasonType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ReturnDecisionReasonType fromValue(String text) {
    for (ReturnDecisionReasonType b : ReturnDecisionReasonType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}



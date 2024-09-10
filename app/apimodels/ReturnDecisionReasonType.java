package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
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

  private final String value;

  ReturnDecisionReasonType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ReturnDecisionReasonType fromValue(String value) {
    for (ReturnDecisionReasonType b : ReturnDecisionReasonType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


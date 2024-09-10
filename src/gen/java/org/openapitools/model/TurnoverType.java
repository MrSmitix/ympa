package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Оценка оборачиваемости.  |enum|Диапазон оборачиваемости|Комментарий| |-|-|-| |&#x60;LOW&#x60;|&#x60;turnoverDays&#x60; ≥ 120|| |&#x60;ALMOST_LOW&#x60;|100 ≤ &#x60;turnoverDays&#x60; &lt; 120|| |&#x60;HIGH&#x60;|45 ≤ &#x60;turnoverDays&#x60; &lt; 100|| |&#x60;VERY_HIGH&#x60;|0 ≤ &#x60;turnoverDays&#x60; &lt; 45|| |&#x60;NO_SALES&#x60;|—|Продаж нет.| |&#x60;FREE_STORE&#x60;|Любое значение.|Товары этой категории сейчас хранятся бесплатно.| 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Оценка оборачиваемости.  |enum|Диапазон оборачиваемости|Комментарий| |-|-|-| |`LOW`|`turnoverDays` ≥ 120|| |`ALMOST_LOW`|100 ≤ `turnoverDays` < 120|| |`HIGH`|45 ≤ `turnoverDays` < 100|| |`VERY_HIGH`|0 ≤ `turnoverDays` < 45|| |`NO_SALES`|—|Продаж нет.| |`FREE_STORE`|Любое значение.|Товары этой категории сейчас хранятся бесплатно.| 
 */
public enum TurnoverType {
  
  LOW("LOW"),
  
  ALMOST_LOW("ALMOST_LOW"),
  
  HIGH("HIGH"),
  
  VERY_HIGH("VERY_HIGH"),
  
  NO_SALES("NO_SALES"),
  
  FREE_STORE("FREE_STORE");

  private String value;

  TurnoverType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TurnoverType fromValue(String text) {
    for (TurnoverType b : TurnoverType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}



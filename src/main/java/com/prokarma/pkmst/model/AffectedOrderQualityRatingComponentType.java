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
 * Составляющие индекса качества.  **Для модели DBS:** * `DBS_CANCELLATION_RATE` — доля отмененных товаров. * `DBS_LATE_DELIVERY_RATE` — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * `FBS_CANCELLATION_RATE` — доля отмененных товаров. * `FBS_LATE_SHIP_RATE` — доля не вовремя отгруженных заказов. 
 */
public enum AffectedOrderQualityRatingComponentType {
  
  DBS_CANCELLATION_RATE("DBS_CANCELLATION_RATE"),
  
  DBS_LATE_DELIVERY_RATE("DBS_LATE_DELIVERY_RATE"),
  
  FBS_CANCELLATION_RATE("FBS_CANCELLATION_RATE"),
  
  FBS_LATE_SHIP_RATE("FBS_LATE_SHIP_RATE");

  private String value;

  AffectedOrderQualityRatingComponentType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AffectedOrderQualityRatingComponentType fromValue(String text) {
    for (AffectedOrderQualityRatingComponentType b : AffectedOrderQualityRatingComponentType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


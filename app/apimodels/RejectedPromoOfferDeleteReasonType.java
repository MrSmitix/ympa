package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Описание ошибки:  * `OFFER_DOES_NOT_EXIST` — в кабинете нет товара с таким SKU. 
 */
public enum RejectedPromoOfferDeleteReasonType {
  
  OFFER_DOES_NOT_EXIST("OFFER_DOES_NOT_EXIST");

  private final String value;

  RejectedPromoOfferDeleteReasonType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static RejectedPromoOfferDeleteReasonType fromValue(String value) {
    for (RejectedPromoOfferDeleteReasonType b : RejectedPromoOfferDeleteReasonType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


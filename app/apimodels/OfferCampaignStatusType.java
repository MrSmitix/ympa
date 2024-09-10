package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Статус товара:  * `PUBLISHED` — Готов к продаже. * `CHECKING` — На проверке. * `DISABLED_BY_PARTNER` — Скрыт вами. * `REJECTED_BY_MARKET` — Отклонен. * `DISABLED_AUTOMATICALLY` — Исправьте ошибки. * `CREATING_CARD` — Создается карточка. * `NO_CARD` — Нужна карточка. * `NO_STOCKS` — Нет на складе. * `ARCHIVED` — В архиве.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/add/statuses.html) 
 */
public enum OfferCampaignStatusType {
  
  PUBLISHED("PUBLISHED"),
  
  CHECKING("CHECKING"),
  
  DISABLED_BY_PARTNER("DISABLED_BY_PARTNER"),
  
  DISABLED_AUTOMATICALLY("DISABLED_AUTOMATICALLY"),
  
  REJECTED_BY_MARKET("REJECTED_BY_MARKET"),
  
  CREATING_CARD("CREATING_CARD"),
  
  NO_CARD("NO_CARD"),
  
  NO_STOCKS("NO_STOCKS"),
  
  ARCHIVED("ARCHIVED");

  private final String value;

  OfferCampaignStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OfferCampaignStatusType fromValue(String value) {
    for (OfferCampaignStatusType b : OfferCampaignStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


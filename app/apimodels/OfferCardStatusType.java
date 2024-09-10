package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Статус карточки товара:  * `HAS_CARD_CAN_NOT_UPDATE` — Карточка Маркета. * `HAS_CARD_CAN_UPDATE` — Можно дополнить. * `HAS_CARD_CAN_UPDATE_ERRORS` — Изменения не приняты. * `HAS_CARD_CAN_UPDATE_PROCESSING` — Изменения на проверке. * `NO_CARD_NEED_CONTENT` — Создайте карточку. * `NO_CARD_MARKET_WILL_CREATE` — Создаст Маркет. * `NO_CARD_ERRORS` — Не создана из-за ошибки. * `NO_CARD_PROCESSING` — Проверяем данные. * `NO_CARD_ADD_TO_CAMPAIGN` — Разместите товар в магазине.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/content/statuses.html) 
 */
public enum OfferCardStatusType {
  
  HAS_CARD_CAN_NOT_UPDATE("HAS_CARD_CAN_NOT_UPDATE"),
  
  HAS_CARD_CAN_UPDATE("HAS_CARD_CAN_UPDATE"),
  
  HAS_CARD_CAN_UPDATE_ERRORS("HAS_CARD_CAN_UPDATE_ERRORS"),
  
  HAS_CARD_CAN_UPDATE_PROCESSING("HAS_CARD_CAN_UPDATE_PROCESSING"),
  
  NO_CARD_NEED_CONTENT("NO_CARD_NEED_CONTENT"),
  
  NO_CARD_MARKET_WILL_CREATE("NO_CARD_MARKET_WILL_CREATE"),
  
  NO_CARD_ERRORS("NO_CARD_ERRORS"),
  
  NO_CARD_PROCESSING("NO_CARD_PROCESSING"),
  
  NO_CARD_ADD_TO_CAMPAIGN("NO_CARD_ADD_TO_CAMPAIGN");

  private final String value;

  OfferCardStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OfferCardStatusType fromValue(String value) {
    for (OfferCardStatusType b : OfferCardStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


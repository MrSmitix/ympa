package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Особый тип товара:  * `MEDICINE` — лекарства. * `BOOK` — бумажные и электронные книги. * `AUDIOBOOK` — аудиокниги. * `ARTIST_TITLE` — музыкальная и видеопродукция. * `ON_DEMAND` — товары на заказ.  {% note info \"Если ваш товар — книга\" %}  Укажите год издания в характеристиках товара. [Подробнее о параметре](../../reference/business-assortment/updateOfferMappings.md#offerparamdto)  {% endnote %} 
 */
public enum OfferType {
  
  DEFAULT("DEFAULT"),
  
  MEDICINE("MEDICINE"),
  
  BOOK("BOOK"),
  
  AUDIOBOOK("AUDIOBOOK"),
  
  ARTIST_TITLE("ARTIST_TITLE"),
  
  ON_DEMAND("ON_DEMAND");

  private final String value;

  OfferType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OfferType fromValue(String value) {
    for (OfferType b : OfferType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


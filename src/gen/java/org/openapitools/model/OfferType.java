package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Особый тип товара:  * &#x60;MEDICINE&#x60; — лекарства. * &#x60;BOOK&#x60; — бумажные и электронные книги. * &#x60;AUDIOBOOK&#x60; — аудиокниги. * &#x60;ARTIST_TITLE&#x60; — музыкальная и видеопродукция. * &#x60;ON_DEMAND&#x60; — товары на заказ.  {% note info \&quot;Если ваш товар — книга\&quot; %}  Укажите год издания в характеристиках товара. [Подробнее о параметре](../../reference/business-assortment/updateOfferMappings.md#offerparamdto)  {% endnote %} 
 **/
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

  private String value;

  OfferType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OfferType fromValue(String text) {
    for (OfferType b : OfferType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}



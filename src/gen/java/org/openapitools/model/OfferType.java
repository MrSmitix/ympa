package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Особый тип товара:  * &#x60;MEDICINE&#x60; — лекарства. * &#x60;BOOK&#x60; — бумажные и электронные книги. * &#x60;AUDIOBOOK&#x60; — аудиокниги. * &#x60;ARTIST_TITLE&#x60; — музыкальная и видеопродукция. * &#x60;ON_DEMAND&#x60; — товары на заказ.  {% note info \&quot;Если ваш товар — книга\&quot; %}  Укажите год издания в характеристиках товара. [Подробнее о параметре](../../reference/business-assortment/updateOfferMappings.md#offerparamdto)  {% endnote %} 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OfferType {

    @JsonProperty("DEFAULT") DEFAULT(String.valueOf("DEFAULT")), @JsonProperty("MEDICINE") MEDICINE(String.valueOf("MEDICINE")), @JsonProperty("BOOK") BOOK(String.valueOf("BOOK")), @JsonProperty("AUDIOBOOK") AUDIOBOOK(String.valueOf("AUDIOBOOK")), @JsonProperty("ARTIST_TITLE") ARTIST_TITLE(String.valueOf("ARTIST_TITLE")), @JsonProperty("ON_DEMAND") ON_DEMAND(String.valueOf("ON_DEMAND"));


    private String value;

    OfferType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OfferType fromValue(String value) {
        for (OfferType b : OfferType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}




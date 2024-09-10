/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Описание ошибки:  * &#x60;OFFER_DOES_NOT_EXIST&#x60; — в кабинете нет товара с таким SKU. 
 */
@JsonAdapter(RejectedPromoOfferDeleteReasonType.Adapter.class)
public enum RejectedPromoOfferDeleteReasonType {
  
  OFFER_DOES_NOT_EXIST("OFFER_DOES_NOT_EXIST");

  private String value;

  RejectedPromoOfferDeleteReasonType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RejectedPromoOfferDeleteReasonType fromValue(String value) {
    for (RejectedPromoOfferDeleteReasonType b : RejectedPromoOfferDeleteReasonType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<RejectedPromoOfferDeleteReasonType> {
    @Override
    public void write(final JsonWriter jsonWriter, final RejectedPromoOfferDeleteReasonType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RejectedPromoOfferDeleteReasonType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RejectedPromoOfferDeleteReasonType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    RejectedPromoOfferDeleteReasonType.fromValue(value);
  }
}


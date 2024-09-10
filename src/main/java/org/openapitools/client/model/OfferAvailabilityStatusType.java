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
 * Планы по поставкам:  * &#x60;ACTIVE&#x60; — поставки будут. * &#x60;INACTIVE&#x60; — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять. Через 60 дней после того, как товар закончится на складе, этот статус изменится на &#x60;DELISTED&#x60;. * &#x60;DELISTED&#x60; — архив: товар закончился на складе, и его поставок больше не будет. Если товар вернется на склад (например, покупатель вернет заказ), этот статус изменится на &#x60;INACTIVE&#x60;. 
 */
@JsonAdapter(OfferAvailabilityStatusType.Adapter.class)
public enum OfferAvailabilityStatusType {
  
  ACTIVE("ACTIVE"),
  
  INACTIVE("INACTIVE"),
  
  DELISTED("DELISTED");

  private String value;

  OfferAvailabilityStatusType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OfferAvailabilityStatusType fromValue(String value) {
    for (OfferAvailabilityStatusType b : OfferAvailabilityStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OfferAvailabilityStatusType> {
    @Override
    public void write(final JsonWriter jsonWriter, final OfferAvailabilityStatusType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OfferAvailabilityStatusType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OfferAvailabilityStatusType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    OfferAvailabilityStatusType.fromValue(value);
  }
}


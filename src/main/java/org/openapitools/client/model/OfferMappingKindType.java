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
 * Вид маппинга.
 */
@JsonAdapter(OfferMappingKindType.Adapter.class)
public enum OfferMappingKindType {
  
  ACTIVE("ACTIVE"),
  
  ALL("ALL");

  private String value;

  OfferMappingKindType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OfferMappingKindType fromValue(String value) {
    for (OfferMappingKindType b : OfferMappingKindType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OfferMappingKindType> {
    @Override
    public void write(final JsonWriter jsonWriter, final OfferMappingKindType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OfferMappingKindType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OfferMappingKindType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    OfferMappingKindType.fromValue(value);
  }
}


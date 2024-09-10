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
 * Тип атрибуции:   * &#x60;CLICKS&#x60; — по кликам.   * &#x60;SHOWS&#x60; — по показам. &lt;br&gt;&lt;br&gt;  О том, какие данные в отчете зависят и не зависят от типа атрибуции, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf#stats). 
 */
@JsonAdapter(ShelfsStatisticsAttributionType.Adapter.class)
public enum ShelfsStatisticsAttributionType {
  
  CLICKS("CLICKS"),
  
  SHOWS("SHOWS");

  private String value;

  ShelfsStatisticsAttributionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ShelfsStatisticsAttributionType fromValue(String value) {
    for (ShelfsStatisticsAttributionType b : ShelfsStatisticsAttributionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ShelfsStatisticsAttributionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ShelfsStatisticsAttributionType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ShelfsStatisticsAttributionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ShelfsStatisticsAttributionType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ShelfsStatisticsAttributionType.fromValue(value);
  }
}


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
 * Вид маркировки товара:  * &#x60;CIS&#x60; — КИЗ, идентификатор единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  * &#x60;UIN&#x60; — УИН, уникальный идентификационный номер.  * &#x60;RNPT&#x60; — РНПТ, регистрационный номер партии товара.  * &#x60;GTD&#x60; — номер ГТД, грузовой таможенной декларации. 
 */
@JsonAdapter(OrderItemInstanceType.Adapter.class)
public enum OrderItemInstanceType {
  
  CIS("CIS"),
  
  UIN("UIN"),
  
  RNPT("RNPT"),
  
  GTD("GTD");

  private String value;

  OrderItemInstanceType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OrderItemInstanceType fromValue(String value) {
    for (OrderItemInstanceType b : OrderItemInstanceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OrderItemInstanceType> {
    @Override
    public void write(final JsonWriter jsonWriter, final OrderItemInstanceType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OrderItemInstanceType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OrderItemInstanceType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    OrderItemInstanceType.fromValue(value);
  }
}


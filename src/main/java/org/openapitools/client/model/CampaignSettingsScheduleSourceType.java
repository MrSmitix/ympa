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
 * Источник информации о расписании работы службы доставки. Возможные значения: * &#x60;WEB&#x60; — информация получена из настроек кабинета продавца на Маркете. * &#x60;YML&#x60; — информация получена из прайс-листа магазина. 
 */
@JsonAdapter(CampaignSettingsScheduleSourceType.Adapter.class)
public enum CampaignSettingsScheduleSourceType {
  
  WEB("WEB"),
  
  YML("YML");

  private String value;

  CampaignSettingsScheduleSourceType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CampaignSettingsScheduleSourceType fromValue(String value) {
    for (CampaignSettingsScheduleSourceType b : CampaignSettingsScheduleSourceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CampaignSettingsScheduleSourceType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CampaignSettingsScheduleSourceType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CampaignSettingsScheduleSourceType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CampaignSettingsScheduleSourceType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    CampaignSettingsScheduleSourceType.fromValue(value);
  }
}


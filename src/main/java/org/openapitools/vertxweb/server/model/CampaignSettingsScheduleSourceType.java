package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Источник информации о расписании работы службы доставки. Возможные значения: * &#x60;WEB&#x60; — информация получена из настроек кабинета продавца на Маркете. * &#x60;YML&#x60; — информация получена из прайс-листа магазина. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Источник информации о расписании работы службы доставки. Возможные значения: * &#x60;WEB&#x60; — информация получена из настроек кабинета продавца на Маркете. * &#x60;YML&#x60; — информация получена из прайс-листа магазина. 
 */
public enum CampaignSettingsScheduleSourceType {
  
  WEB("WEB"),
  
  YML("YML");

  private String value;

  CampaignSettingsScheduleSourceType(String value) {
    this.value = value;
  }

  @JsonValue
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
}
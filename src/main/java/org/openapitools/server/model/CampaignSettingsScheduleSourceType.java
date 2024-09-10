package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Источник информации о расписании работы службы доставки. Возможные значения: * `WEB` — информация получена из настроек кабинета продавца на Маркете. * `YML` — информация получена из прайс-листа магазина. 
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

    @JsonCreator
    public static CampaignSettingsScheduleSourceType fromValue(String text) {
        for (CampaignSettingsScheduleSourceType b : CampaignSettingsScheduleSourceType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}


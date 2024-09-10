package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Статус индексации прайс-листа и проверки на соответствие техническим требованиям.  Возможные значения:  * `ERROR` — произошли ошибки. * `OK` — обработан без ошибок. * `WARNING` — наблюдались некритичные проблемы. 
 */

public enum FeedIndexLogsStatusType {

    ERROR("ERROR"),
    OK("OK"),
    WARNING("WARNING");

    private String value;

    FeedIndexLogsStatusType(String value) {
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
    public static FeedIndexLogsStatusType fromValue(String text) {
        for (FeedIndexLogsStatusType b : FeedIndexLogsStatusType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}


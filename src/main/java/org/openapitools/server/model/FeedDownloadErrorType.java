package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Тип ошибки загрузки прайс-листа.  Возможные значения:  * `DOWNLOAD_ERROR` — ошибка загрузки прайс-листа. Например, проблема с DNS-сервером или обрыв интернет-соединения.   Проблема описана в параметре `description`.  * `DOWNLOAD_HTTP_ERROR` — Яндекс Маркет передал запрос на получение прайс-листа и получил в ответ HTTP-код, отличный от 2xx.  HTTP-код выведен в параметре `httpStatusCode`. 
 */

public enum FeedDownloadErrorType {

    ERROR("DOWNLOAD_ERROR"),
    HTTP_ERROR("DOWNLOAD_HTTP_ERROR");

    private String value;

    FeedDownloadErrorType(String value) {
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
    public static FeedDownloadErrorType fromValue(String text) {
        for (FeedDownloadErrorType b : FeedDownloadErrorType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}


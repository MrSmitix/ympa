package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Тип ошибки индексации прайс-листа.  Возможные значения:  * &#x60;DOWNLOAD_ERROR&#x60; — ошибка загрузки прайс-листа. Например, проблема с DNS-сервером или обрыв интернет-соединения.    Проблема описана в параметре &#x60;description&#x60;.  * &#x60;DOWNLOAD_HTTP_ERROR&#x60; — Маркет передал запрос на получение прайс-листа и получил в ответ HTTP-код, отличный от 2xx.    HTTP-код выведен в параметре &#x60;httpStatusCode&#x60;.  * &#x60;PARSE_ERROR&#x60; — ошибка при проверке прайс-листа, не связанная с форматом YML. Например, прайс-лист пустой или его не удалось разархивировать.  * &#x60;PARSE_XML_ERROR&#x60; — несоответствие техническим требованиям формата YML. Например, элементы и их значения описаны некорректно.  * &#x60;TOO_MANY_REJECTED_OFFERS&#x60; — более чем в половине предложений из прайс-листа найдены ошибки. Все предложения из прайс-листа не будут опубликованы на Маркете. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum FeedIndexLogsErrorType {

    @JsonProperty("DOWNLOAD_ERROR") DOWNLOAD_ERROR(String.valueOf("DOWNLOAD_ERROR")), @JsonProperty("DOWNLOAD_HTTP_ERROR") DOWNLOAD_HTTP_ERROR(String.valueOf("DOWNLOAD_HTTP_ERROR")), @JsonProperty("PARSE_ERROR") PARSE_ERROR(String.valueOf("PARSE_ERROR")), @JsonProperty("PARSE_XML_ERROR") PARSE_XML_ERROR(String.valueOf("PARSE_XML_ERROR")), @JsonProperty("TOO_MANY_REJECTED_OFFERS") TOO_MANY_REJECTED_OFFERS(String.valueOf("TOO_MANY_REJECTED_OFFERS")), @JsonProperty("NOT_INDEXED") NOT_INDEXED(String.valueOf("NOT_INDEXED"));


    private String value;

    FeedIndexLogsErrorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FeedIndexLogsErrorType fromValue(String value) {
        for (FeedIndexLogsErrorType b : FeedIndexLogsErrorType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}




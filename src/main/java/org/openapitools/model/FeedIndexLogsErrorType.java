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

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Тип ошибки индексации прайс-листа.  Возможные значения:  * &#x60;DOWNLOAD_ERROR&#x60; — ошибка загрузки прайс-листа. Например, проблема с DNS-сервером или обрыв интернет-соединения.    Проблема описана в параметре &#x60;description&#x60;.  * &#x60;DOWNLOAD_HTTP_ERROR&#x60; — Маркет передал запрос на получение прайс-листа и получил в ответ HTTP-код, отличный от 2xx.    HTTP-код выведен в параметре &#x60;httpStatusCode&#x60;.  * &#x60;PARSE_ERROR&#x60; — ошибка при проверке прайс-листа, не связанная с форматом YML. Например, прайс-лист пустой или его не удалось разархивировать.  * &#x60;PARSE_XML_ERROR&#x60; — несоответствие техническим требованиям формата YML. Например, элементы и их значения описаны некорректно.  * &#x60;TOO_MANY_REJECTED_OFFERS&#x60; — более чем в половине предложений из прайс-листа найдены ошибки. Все предложения из прайс-листа не будут опубликованы на Маркете. 
 */
@Introspected
public enum FeedIndexLogsErrorType {
    DOWNLOAD_ERROR("DOWNLOAD_ERROR"),
    DOWNLOAD_HTTP_ERROR("DOWNLOAD_HTTP_ERROR"),
    PARSE_ERROR("PARSE_ERROR"),
    PARSE_XML_ERROR("PARSE_XML_ERROR"),
    TOO_MANY_REJECTED_OFFERS("TOO_MANY_REJECTED_OFFERS"),
    NOT_INDEXED("NOT_INDEXED");

    private String value;

    FeedIndexLogsErrorType(String value) {
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
    public static FeedIndexLogsErrorType fromValue(String value) {
        for (FeedIndexLogsErrorType b : FeedIndexLogsErrorType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}


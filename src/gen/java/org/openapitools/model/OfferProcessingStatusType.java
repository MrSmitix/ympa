package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Статус публикации товара:  * &#x60;READY&#x60; — товар прошел модерацию. Чтобы разместить его на Маркете, установите для него цену. * &#x60;IN_WORK&#x60; — товар проходит модерацию. Это занимает несколько дней. * &#x60;NEED_CONTENT&#x60; — для товара без SKU на Маркете &#x60;marketSku&#x60; нужно найти карточку самостоятельно (через API или кабинет продавца на Маркете) или создать ее, если товар еще не продается на Маркете. * &#x60;NEED_INFO&#x60; — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара. Информация о причинах отклонения возвращается в параметре &#x60;notes&#x60;. * &#x60;REJECTED&#x60; — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары. * &#x60;SUSPENDED&#x60; — товар не прошел модерацию, так как Маркет пока не размещает подобные товары. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OfferProcessingStatusType {

    @JsonProperty("UNKNOWN") UNKNOWN(String.valueOf("UNKNOWN")), @JsonProperty("READY") READY(String.valueOf("READY")), @JsonProperty("IN_WORK") IN_WORK(String.valueOf("IN_WORK")), @JsonProperty("NEED_INFO") NEED_INFO(String.valueOf("NEED_INFO")), @JsonProperty("NEED_MAPPING") NEED_MAPPING(String.valueOf("NEED_MAPPING")), @JsonProperty("NEED_CONTENT") NEED_CONTENT(String.valueOf("NEED_CONTENT")), @JsonProperty("CONTENT_PROCESSING") CONTENT_PROCESSING(String.valueOf("CONTENT_PROCESSING")), @JsonProperty("SUSPENDED") SUSPENDED(String.valueOf("SUSPENDED")), @JsonProperty("REJECTED") REJECTED(String.valueOf("REJECTED")), @JsonProperty("REVIEW") REVIEW(String.valueOf("REVIEW")), @JsonProperty("CREATE_ERROR") CREATE_ERROR(String.valueOf("CREATE_ERROR")), @JsonProperty("UPDATE_ERROR") UPDATE_ERROR(String.valueOf("UPDATE_ERROR"));


    private String value;

    OfferProcessingStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OfferProcessingStatusType fromValue(String value) {
        for (OfferProcessingStatusType b : OfferProcessingStatusType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}




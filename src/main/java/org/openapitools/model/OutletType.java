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
import io.swagger.v3.oas.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Тип точки продаж.  Возможные значения:  * &#x60;DEPOT&#x60; — пункт выдачи заказов. * &#x60;MIXED&#x60; — смешанный тип точки продаж (торговый зал и пункт выдачи заказов). * &#x60;RETAIL&#x60; — розничная точка продаж (торговый зал). 
 */
@Introspected
public enum OutletType {
    DEPOT("DEPOT"),
    MIXED("MIXED"),
    RETAIL("RETAIL"),
    NOT_DEFINED("NOT_DEFINED");

    private String value;

    OutletType(String value) {
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
    public static OutletType fromValue(String value) {
        for (OutletType b : OutletType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}


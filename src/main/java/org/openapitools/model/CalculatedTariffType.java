/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Услуга Маркета:  * `AGENCY_COMMISSION` — прием платежа покупателя.  * `PAYMENT_TRANSFER` — перевод платежа покупателя.  * `FEE` — размещение товара на Маркете.  * `DELIVERY_TO_CUSTOMER` — доставка покупателю.  * `CROSSREGIONAL_DELIVERY` — доставка в федеральный округ, город или населенный пункт.  * `EXPRESS_DELIVERY` — экспресс-доставка покупателю.  * `SORTING` — обработка заказа.  * `MIDDLE_MILE` — средняя миля.  Подробнее об услугах Маркета читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/index.html). 
 */

/**
 * Услуга Маркета:  * `AGENCY_COMMISSION` — прием платежа покупателя.  * `PAYMENT_TRANSFER` — перевод платежа покупателя.  * `FEE` — размещение товара на Маркете.  * `DELIVERY_TO_CUSTOMER` — доставка покупателю.  * `CROSSREGIONAL_DELIVERY` — доставка в федеральный округ, город или населенный пункт.  * `EXPRESS_DELIVERY` — экспресс-доставка покупателю.  * `SORTING` — обработка заказа.  * `MIDDLE_MILE` — средняя миля.  Подробнее об услугах Маркета читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/index.html). 
 */
public enum CalculatedTariffType {
    
        AGENCY_COMMISSION("AGENCY_COMMISSION"),
        
        PAYMENT_TRANSFER("PAYMENT_TRANSFER"),
        
        FEE("FEE"),
        
        DELIVERY_TO_CUSTOMER("DELIVERY_TO_CUSTOMER"),
        
        CROSSREGIONAL_DELIVERY("CROSSREGIONAL_DELIVERY"),
        
        EXPRESS_DELIVERY("EXPRESS_DELIVERY"),
        
        SORTING("SORTING"),
        
        MIDDLE_MILE("MIDDLE_MILE");

private String value;

CalculatedTariffType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static CalculatedTariffType fromValue(String text) {
for (CalculatedTariffType b : CalculatedTariffType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}



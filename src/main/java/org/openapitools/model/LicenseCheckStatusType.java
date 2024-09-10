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
 * Статус проверки лицензии:  * `NEW` — лицензия проверяется. * `SUCCESS` — лицензия прошла проверку. * `FAIL` — лицензия не прошла проверку. 
 */

/**
 * Статус проверки лицензии:  * `NEW` — лицензия проверяется. * `SUCCESS` — лицензия прошла проверку. * `FAIL` — лицензия не прошла проверку. 
 */
public enum LicenseCheckStatusType {
    
        NEW("NEW"),
        
        SUCCESS("SUCCESS"),
        
        FAIL("FAIL"),
        
        REVOKE("REVOKE"),
        
        DONT_WANT("DONT_WANT"),
        
        FAIL_MANUAL("FAIL_MANUAL");

private String value;

LicenseCheckStatusType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static LicenseCheckStatusType fromValue(String text) {
for (LicenseCheckStatusType b : LicenseCheckStatusType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}



package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Тип региона.  Возможные значения:  * `CITY_DISTRICT` — район города.  * `CITY` — крупный город.  * `CONTINENT` — континент.  * `COUNTRY_DISTRICT` — область.  * `COUNTRY` — страна.  * `REGION` — регион.  * `REPUBLIC_AREA` — район субъекта федерации.  * `REPUBLIC` — субъект федерации.  * `SUBWAY_STATION` — станция метро.  * `VILLAGE` — город.  * `OTHER` — неизвестный регион. 
 */

public enum RegionType {

    OTHER("OTHER"),
    CONTINENT("CONTINENT"),
    REGION("REGION"),
    COUNTRY("COUNTRY"),
    COUNTRY_DISTRICT("COUNTRY_DISTRICT"),
    REPUBLIC("REPUBLIC"),
    CITY("CITY"),
    VILLAGE("VILLAGE"),
    CITY_DISTRICT("CITY_DISTRICT"),
    SUBWAY_STATION("SUBWAY_STATION"),
    REPUBLIC_AREA("REPUBLIC_AREA");

    private String value;

    RegionType(String value) {
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
    public static RegionType fromValue(String text) {
        for (RegionType b : RegionType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}


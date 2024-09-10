package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Тип региона.  Возможные значения:  * &#x60;CITY_DISTRICT&#x60; — район города.  * &#x60;CITY&#x60; — крупный город.  * &#x60;CONTINENT&#x60; — континент.  * &#x60;COUNTRY_DISTRICT&#x60; — область.  * &#x60;COUNTRY&#x60; — страна.  * &#x60;REGION&#x60; — регион.  * &#x60;REPUBLIC_AREA&#x60; — район субъекта федерации.  * &#x60;REPUBLIC&#x60; — субъект федерации.  * &#x60;SUBWAY_STATION&#x60; — станция метро.  * &#x60;VILLAGE&#x60; — город.  * &#x60;OTHER&#x60; — неизвестный регион. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum RegionType {

    @JsonProperty("OTHER") OTHER(String.valueOf("OTHER")), @JsonProperty("CONTINENT") CONTINENT(String.valueOf("CONTINENT")), @JsonProperty("REGION") REGION(String.valueOf("REGION")), @JsonProperty("COUNTRY") COUNTRY(String.valueOf("COUNTRY")), @JsonProperty("COUNTRY_DISTRICT") COUNTRY_DISTRICT(String.valueOf("COUNTRY_DISTRICT")), @JsonProperty("REPUBLIC") REPUBLIC(String.valueOf("REPUBLIC")), @JsonProperty("CITY") CITY(String.valueOf("CITY")), @JsonProperty("VILLAGE") VILLAGE(String.valueOf("VILLAGE")), @JsonProperty("CITY_DISTRICT") CITY_DISTRICT(String.valueOf("CITY_DISTRICT")), @JsonProperty("SUBWAY_STATION") SUBWAY_STATION(String.valueOf("SUBWAY_STATION")), @JsonProperty("REPUBLIC_AREA") REPUBLIC_AREA(String.valueOf("REPUBLIC_AREA"));


    private String value;

    RegionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RegionType fromValue(String value) {
        for (RegionType b : RegionType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}




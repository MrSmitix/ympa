package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Тип региона.  Возможные значения:  * &#x60;CITY_DISTRICT&#x60; — район города.  * &#x60;CITY&#x60; — крупный город.  * &#x60;CONTINENT&#x60; — континент.  * &#x60;COUNTRY_DISTRICT&#x60; — область.  * &#x60;COUNTRY&#x60; — страна.  * &#x60;REGION&#x60; — регион.  * &#x60;REPUBLIC_AREA&#x60; — район субъекта федерации.  * &#x60;REPUBLIC&#x60; — субъект федерации.  * &#x60;SUBWAY_STATION&#x60; — станция метро.  * &#x60;VILLAGE&#x60; — город.  * &#x60;OTHER&#x60; — неизвестный регион. 
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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static RegionType fromString(String s) {
      for (RegionType b : RegionType.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static RegionType fromValue(String value) {
    for (RegionType b : RegionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}



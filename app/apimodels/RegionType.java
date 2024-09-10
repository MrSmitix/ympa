package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

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

  private final String value;

  RegionType(String value) {
    this.value = value;
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


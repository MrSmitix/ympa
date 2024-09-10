package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Тип атрибуции:   * `CLICKS` — по кликам.   * `SHOWS` — по показам. <br><br>  О том, какие данные в отчете зависят и не зависят от типа атрибуции, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf#stats). 
 */
public enum ShelfsStatisticsAttributionType {
  
  CLICKS("CLICKS"),
  
  SHOWS("SHOWS");

  private final String value;

  ShelfsStatisticsAttributionType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ShelfsStatisticsAttributionType fromValue(String value) {
    for (ShelfsStatisticsAttributionType b : ShelfsStatisticsAttributionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


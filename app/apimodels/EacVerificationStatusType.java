package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Статус проверки кода подтверждения:  * `ACCEPTED` — код верный. * `REJECTED` — код неверный. * `NEED_UPDATE` — Маркет отправит новый код. Значение возвращается, если превышено количество попыток отправки кода. 
 */
public enum EacVerificationStatusType {
  
  ACCEPTED("ACCEPTED"),
  
  REJECTED("REJECTED"),
  
  NEED_UPDATE("NEED_UPDATE");

  private final String value;

  EacVerificationStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EacVerificationStatusType fromValue(String value) {
    for (EacVerificationStatusType b : EacVerificationStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


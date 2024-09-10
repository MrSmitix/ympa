package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Статус точки продаж.  Возможные значения:  * `AT_MODERATION` — проверяется. * `FAILED` — не прошла проверку и отклонена модератором. * `MODERATED` — проверена и одобрена. * `NONMODERATED` — новая точка, нуждается в проверке. 
 */
public enum OutletStatusType {
  
  AT_MODERATION("AT_MODERATION"),
  
  FAILED("FAILED"),
  
  MODERATED("MODERATED"),
  
  NONMODERATED("NONMODERATED"),
  
  UNKNOWN("UNKNOWN");

  private final String value;

  OutletStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OutletStatusType fromValue(String value) {
    for (OutletStatusType b : OutletStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


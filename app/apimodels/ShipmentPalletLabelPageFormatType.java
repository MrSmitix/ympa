package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Формат страницы: * `A4` — формат страницы A4. * `A8` — формат страницы A8. 
 */
public enum ShipmentPalletLabelPageFormatType {
  
  A4("A4"),
  
  A8("A8");

  private final String value;

  ShipmentPalletLabelPageFormatType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ShipmentPalletLabelPageFormatType fromValue(String value) {
    for (ShipmentPalletLabelPageFormatType b : ShipmentPalletLabelPageFormatType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


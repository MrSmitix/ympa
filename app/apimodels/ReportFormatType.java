package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Формат отчета:  * `FILE` — файл с электронной таблицей. * `CSV` — ZIP-архив с CSV-файлами на каждый лист отчета. 
 */
public enum ReportFormatType {
  
  FILE("FILE"),
  
  CSV("CSV");

  private final String value;

  ReportFormatType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ReportFormatType fromValue(String value) {
    for (ReportFormatType b : ReportFormatType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


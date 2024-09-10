package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Тип остатков товаров на складе:  * `AVAILABLE` (соответствует типу «Доступный к заказу» в отчете «Остатки на складе» в кабинете продавца на Маркете) — товар, доступный для продажи.  * `DEFECT` (соответствует типу «Брак») — товар с браком.  * `EXPIRED` (соответствует типу «Просрочен») — товар с истекшим сроком годности.  * `FIT` (соответствует типу «Годный») — товар, который доступен для продажи или уже зарезервирован.  * `FREEZE` — товар, который зарезервирован для заказов.  * `QUARANTINE` (соответствует типу «Карантин») — товар, временно недоступный для продажи (например, товар перемещают из одного помещения склада в другое).  * `UTILIZATION` — товар, который будет утилизирован. 
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public enum WarehouseStockType {
  
  FIT("FIT"),
  
  FREEZE("FREEZE"),
  
  AVAILABLE("AVAILABLE"),
  
  QUARANTINE("QUARANTINE"),
  
  UTILIZATION("UTILIZATION"),
  
  DEFECT("DEFECT"),
  
  EXPIRED("EXPIRED");

  private String value;

  WarehouseStockType(String value) {
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
  public static WarehouseStockType fromValue(String value) {
    for (WarehouseStockType b : WarehouseStockType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


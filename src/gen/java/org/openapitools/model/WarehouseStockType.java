package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Тип остатков товаров на складе:  * &#x60;AVAILABLE&#x60; (соответствует типу «Доступный к заказу» в отчете «Остатки на складе» в кабинете продавца на Маркете) — товар, доступный для продажи.  * &#x60;DEFECT&#x60; (соответствует типу «Брак») — товар с браком.  * &#x60;EXPIRED&#x60; (соответствует типу «Просрочен») — товар с истекшим сроком годности.  * &#x60;FIT&#x60; (соответствует типу «Годный») — товар, который доступен для продажи или уже зарезервирован.  * &#x60;FREEZE&#x60; — товар, который зарезервирован для заказов.  * &#x60;QUARANTINE&#x60; (соответствует типу «Карантин») — товар, временно недоступный для продажи (например, товар перемещают из одного помещения склада в другое).  * &#x60;UTILIZATION&#x60; — товар, который будет утилизирован. 
 */
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

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WarehouseStockType fromValue(String value) {
    for (WarehouseStockType b : WarehouseStockType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}


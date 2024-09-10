package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Планы по поставкам:  * &#x60;ACTIVE&#x60; — поставки будут. * &#x60;INACTIVE&#x60; — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять. Через 60 дней после того, как товар закончится на складе, этот статус изменится на &#x60;DELISTED&#x60;. * &#x60;DELISTED&#x60; — архив: товар закончился на складе, и его поставок больше не будет. Если товар вернется на склад (например, покупатель вернет заказ), этот статус изменится на &#x60;INACTIVE&#x60;. 
 */
public enum OfferAvailabilityStatusType {
  
  ACTIVE("ACTIVE"),
  
  INACTIVE("INACTIVE"),
  
  DELISTED("DELISTED");

  private String value;

  OfferAvailabilityStatusType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OfferAvailabilityStatusType fromValue(String value) {
    for (OfferAvailabilityStatusType b : OfferAvailabilityStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}


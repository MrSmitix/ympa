/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Составляющие индекса качества.  **Для модели DBS:** * &#x60;DBS_CANCELLATION_RATE&#x60; — доля отмененных товаров. * &#x60;DBS_LATE_DELIVERY_RATE&#x60; — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * &#x60;FBS_CANCELLATION_RATE&#x60; — доля отмененных товаров. * &#x60;FBS_LATE_SHIP_RATE&#x60; — доля не вовремя отгруженных заказов.  **Для модели FBY:** * &#x60;FBY_LATE_DELIVERY_RATE&#x60; — доля товаров, которые приехали на склад с опозданием. * &#x60;FBY_CANCELLATION_RATE&#x60; — доля отмененных или недоставленных товаров. * &#x60;FBY_DELIVERY_DIFF_RATE&#x60; — доля товаров, которые не прибыли вместе с поставкой или которые не приняли. * &#x60;FBY_LATE_EDITING_RATE&#x60; — доля товаров, которые поздно убрали из заявки. 
 */
public enum QualityRatingComponentType {
  
  DBS_CANCELLATION_RATE("DBS_CANCELLATION_RATE"),
  
  DBS_LATE_DELIVERY_RATE("DBS_LATE_DELIVERY_RATE"),
  
  FBS_CANCELLATION_RATE("FBS_CANCELLATION_RATE"),
  
  FBS_LATE_SHIP_RATE("FBS_LATE_SHIP_RATE"),
  
  FBY_LATE_DELIVERY_RATE("FBY_LATE_DELIVERY_RATE"),
  
  FBY_CANCELLATION_RATE("FBY_CANCELLATION_RATE"),
  
  FBY_DELIVERY_DIFF_RATE("FBY_DELIVERY_DIFF_RATE"),
  
  FBY_LATE_EDITING_RATE("FBY_LATE_EDITING_RATE");

  private String value;

  QualityRatingComponentType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static QualityRatingComponentType fromValue(String text) {
    for (QualityRatingComponentType b : QualityRatingComponentType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

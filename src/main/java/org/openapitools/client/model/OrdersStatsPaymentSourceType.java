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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Способ денежного перевода: - &#x60;BUYER&#x60; — оплата или возврат деньгами. - &#x60;CASHBACK&#x60; — оплата или возврат баллами Плюса. - &#x60;MARKETPLACE&#x60; — оплата или возврат купонами. - &#x60;SPLIT&#x60; — оплата картой по частям (Сплит). 
 **/
@ApiModel(description = "Способ денежного перевода: - `BUYER` — оплата или возврат деньгами. - `CASHBACK` — оплата или возврат баллами Плюса. - `MARKETPLACE` — оплата или возврат купонами. - `SPLIT` — оплата картой по частям (Сплит). ")
public class OrdersStatsPaymentSourceType {
  


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrdersStatsPaymentSourceType ordersStatsPaymentSourceType = (OrdersStatsPaymentSourceType) o;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 17;
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrdersStatsPaymentSourceType {\n");
    
    sb.append("}\n");
    return sb.toString();
  }
}

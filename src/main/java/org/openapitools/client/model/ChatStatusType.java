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
 * Статус чата:  * &#x60;NEW&#x60; — новый чат. * &#x60;WAITING_FOR_CUSTOMER&#x60; — нужен ответ покупателя. * &#x60;WAITING_FOR_PARTNER&#x60; — нужен ответ магазина. * &#x60;WAITING_FOR_ARBITER&#x60; — нужен ответ арбитра. * &#x60;WAITING_FOR_MARKET&#x60; — нужен ответ Маркета. * &#x60;FINISHED&#x60; — чат завершен. 
 **/
@ApiModel(description = "Статус чата:  * `NEW` — новый чат. * `WAITING_FOR_CUSTOMER` — нужен ответ покупателя. * `WAITING_FOR_PARTNER` — нужен ответ магазина. * `WAITING_FOR_ARBITER` — нужен ответ арбитра. * `WAITING_FOR_MARKET` — нужен ответ Маркета. * `FINISHED` — чат завершен. ")
public class ChatStatusType {
  


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatStatusType chatStatusType = (ChatStatusType) o;
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
    sb.append("class ChatStatusType {\n");
    
    sb.append("}\n");
    return sb.toString();
  }
}

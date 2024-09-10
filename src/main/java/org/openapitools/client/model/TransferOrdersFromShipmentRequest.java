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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
  * Запрос переноса заказов из отгрузки.
 **/

public class TransferOrdersFromShipmentRequest  {
  
 /**
   * Список заказов, которые вы не успеваете подготовить.
  **/
  private List<Long> orderIds = new ArrayList<>();

 /**
   * Список заказов, которые вы не успеваете подготовить.
   * @return orderIds
  **/
  public List<Long> getOrderIds() {
    return orderIds;
  }

  /**
    * Set orderIds
  **/
  public void setOrderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
  }

  public TransferOrdersFromShipmentRequest orderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
    return this;
  }

  public TransferOrdersFromShipmentRequest addOrderIdsItem(Long orderIdsItem) {
    this.orderIds.add(orderIdsItem);
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferOrdersFromShipmentRequest {\n");
    
    sb.append("    orderIds: ").append(toIndentedString(orderIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

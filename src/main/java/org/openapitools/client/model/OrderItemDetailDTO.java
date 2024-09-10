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
import org.openapitools.client.model.OrderItemStatusType;



/**
  * Детали по товару в заказе.
 **/

public class OrderItemDetailDTO  {
  
 /**
   * Количество единиц товара.
  **/
  private Long itemCount;

  private OrderItemStatusType itemStatus;

 /**
   * Формат даты: `ДД-ММ-ГГГГ`. 
  **/
  private String updateDate;

 /**
   * Количество единиц товара.
   * @return itemCount
  **/
  public Long getItemCount() {
    return itemCount;
  }

  /**
    * Set itemCount
  **/
  public void setItemCount(Long itemCount) {
    this.itemCount = itemCount;
  }

  public OrderItemDetailDTO itemCount(Long itemCount) {
    this.itemCount = itemCount;
    return this;
  }

 /**
   * Get itemStatus
   * @return itemStatus
  **/
  public OrderItemStatusType getItemStatus() {
    return itemStatus;
  }

  /**
    * Set itemStatus
  **/
  public void setItemStatus(OrderItemStatusType itemStatus) {
    this.itemStatus = itemStatus;
  }

  public OrderItemDetailDTO itemStatus(OrderItemStatusType itemStatus) {
    this.itemStatus = itemStatus;
    return this;
  }

 /**
   * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
   * @return updateDate
  **/
  public String getUpdateDate() {
    return updateDate;
  }

  /**
    * Set updateDate
  **/
  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }

  public OrderItemDetailDTO updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemDetailDTO {\n");
    
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
    sb.append("    itemStatus: ").append(toIndentedString(itemStatus)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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

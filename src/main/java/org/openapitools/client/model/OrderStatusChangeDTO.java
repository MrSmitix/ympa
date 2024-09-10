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
import org.openapitools.client.model.OrderStatusChangeDeliveryDTO;
import org.openapitools.client.model.OrderStatusType;
import org.openapitools.client.model.OrderSubstatusType;



/**
  * Заказ.
 **/

public class OrderStatusChangeDTO  {
  
  private OrderStatusType status;

  private OrderSubstatusType substatus;

  private OrderStatusChangeDeliveryDTO delivery;

 /**
   * Get status
   * @return status
  **/
  public OrderStatusType getStatus() {
    return status;
  }

  /**
    * Set status
  **/
  public void setStatus(OrderStatusType status) {
    this.status = status;
  }

  public OrderStatusChangeDTO status(OrderStatusType status) {
    this.status = status;
    return this;
  }

 /**
   * Get substatus
   * @return substatus
  **/
  public OrderSubstatusType getSubstatus() {
    return substatus;
  }

  /**
    * Set substatus
  **/
  public void setSubstatus(OrderSubstatusType substatus) {
    this.substatus = substatus;
  }

  public OrderStatusChangeDTO substatus(OrderSubstatusType substatus) {
    this.substatus = substatus;
    return this;
  }

 /**
   * Get delivery
   * @return delivery
  **/
  public OrderStatusChangeDeliveryDTO getDelivery() {
    return delivery;
  }

  /**
    * Set delivery
  **/
  public void setDelivery(OrderStatusChangeDeliveryDTO delivery) {
    this.delivery = delivery;
  }

  public OrderStatusChangeDTO delivery(OrderStatusChangeDeliveryDTO delivery) {
    this.delivery = delivery;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderStatusChangeDTO {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    substatus: ").append(toIndentedString(substatus)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
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


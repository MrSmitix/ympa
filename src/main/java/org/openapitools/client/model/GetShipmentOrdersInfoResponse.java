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
import org.openapitools.client.model.ApiResponseStatusType;
import org.openapitools.client.model.OrdersShipmentInfoDTO;




public class GetShipmentOrdersInfoResponse  {
  
  private ApiResponseStatusType status;

  private OrdersShipmentInfoDTO result;

 /**
   * Get status
   * @return status
  **/
  public ApiResponseStatusType getStatus() {
    return status;
  }

  /**
    * Set status
  **/
  public void setStatus(ApiResponseStatusType status) {
    this.status = status;
  }

  public GetShipmentOrdersInfoResponse status(ApiResponseStatusType status) {
    this.status = status;
    return this;
  }

 /**
   * Get result
   * @return result
  **/
  public OrdersShipmentInfoDTO getResult() {
    return result;
  }

  /**
    * Set result
  **/
  public void setResult(OrdersShipmentInfoDTO result) {
    this.result = result;
  }

  public GetShipmentOrdersInfoResponse result(OrdersShipmentInfoDTO result) {
    this.result = result;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetShipmentOrdersInfoResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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


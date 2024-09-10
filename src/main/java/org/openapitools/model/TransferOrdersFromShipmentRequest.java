/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 * Запрос переноса заказов из отгрузки.
 */

@ApiModel(description = "Запрос переноса заказов из отгрузки.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class TransferOrdersFromShipmentRequest   {
  
  private List<Long> orderIds = new ArrayList<>();

  /**
   * Список заказов, которые вы не успеваете подготовить.
   */
  public TransferOrdersFromShipmentRequest orderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список заказов, которые вы не успеваете подготовить.")
  @JsonProperty("orderIds")
  public List<Long> getOrderIds() {
    return orderIds;
  }
  public void setOrderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest = (TransferOrdersFromShipmentRequest) o;
    return Objects.equals(orderIds, transferOrdersFromShipmentRequest.orderIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderIds);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


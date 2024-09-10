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
import java.util.LinkedHashSet;
import java.util.Set;



/**
 * Годные/негодные ярлыки по заказам в отгрузке.
 */

@ApiModel(description = "Годные/негодные ярлыки по заказам в отгрузке.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrdersShipmentInfoDTO   {
  
  private Set<Long> orderIdsWithLabels = new LinkedHashSet<>();
  private Set<Long> orderIdsWithoutLabels = new LinkedHashSet<>();

  /**
   * Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.
   */
  public OrdersShipmentInfoDTO orderIdsWithLabels(Set<Long> orderIdsWithLabels) {
    this.orderIdsWithLabels = orderIdsWithLabels;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.")
  @JsonProperty("orderIdsWithLabels")
  public Set<Long> getOrderIdsWithLabels() {
    return orderIdsWithLabels;
  }
  public void setOrderIdsWithLabels(Set<Long> orderIdsWithLabels) {
    this.orderIdsWithLabels = orderIdsWithLabels;
  }

  /**
   * Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.
   */
  public OrdersShipmentInfoDTO orderIdsWithoutLabels(Set<Long> orderIdsWithoutLabels) {
    this.orderIdsWithoutLabels = orderIdsWithoutLabels;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.")
  @JsonProperty("orderIdsWithoutLabels")
  public Set<Long> getOrderIdsWithoutLabels() {
    return orderIdsWithoutLabels;
  }
  public void setOrderIdsWithoutLabels(Set<Long> orderIdsWithoutLabels) {
    this.orderIdsWithoutLabels = orderIdsWithoutLabels;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrdersShipmentInfoDTO ordersShipmentInfoDTO = (OrdersShipmentInfoDTO) o;
    return Objects.equals(orderIdsWithLabels, ordersShipmentInfoDTO.orderIdsWithLabels) &&
        Objects.equals(orderIdsWithoutLabels, ordersShipmentInfoDTO.orderIdsWithoutLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderIdsWithLabels, orderIdsWithoutLabels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrdersShipmentInfoDTO {\n");
    
    sb.append("    orderIdsWithLabels: ").append(toIndentedString(orderIdsWithLabels)).append("\n");
    sb.append("    orderIdsWithoutLabels: ").append(toIndentedString(orderIdsWithoutLabels)).append("\n");
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


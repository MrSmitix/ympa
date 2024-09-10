package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.LinkedHashSet;
import java.util.Set;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Годные/негодные ярлыки по заказам в отгрузке.
 **/
@ApiModel(description="Годные/негодные ярлыки по заказам в отгрузке.")

public class OrdersShipmentInfoDTO  {
  
  @ApiModelProperty(required = true, value = "Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.")
 /**
   * Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.
  **/
  private Set<Long> orderIdsWithLabels = new LinkedHashSet<>();

  @ApiModelProperty(required = true, value = "Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.")
 /**
   * Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.
  **/
  private Set<Long> orderIdsWithoutLabels = new LinkedHashSet<>();
 /**
   * Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.
   * @return orderIdsWithLabels
  **/
  @JsonProperty("orderIdsWithLabels")
  public Set<Long> getOrderIdsWithLabels() {
    return orderIdsWithLabels;
  }

  public void setOrderIdsWithLabels(Set<Long> orderIdsWithLabels) {
    this.orderIdsWithLabels = orderIdsWithLabels;
  }

  public OrdersShipmentInfoDTO orderIdsWithLabels(Set<Long> orderIdsWithLabels) {
    this.orderIdsWithLabels = orderIdsWithLabels;
    return this;
  }

  public OrdersShipmentInfoDTO addOrderIdsWithLabelsItem(Long orderIdsWithLabelsItem) {
    this.orderIdsWithLabels.add(orderIdsWithLabelsItem);
    return this;
  }

 /**
   * Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.
   * @return orderIdsWithoutLabels
  **/
  @JsonProperty("orderIdsWithoutLabels")
  public Set<Long> getOrderIdsWithoutLabels() {
    return orderIdsWithoutLabels;
  }

  public void setOrderIdsWithoutLabels(Set<Long> orderIdsWithoutLabels) {
    this.orderIdsWithoutLabels = orderIdsWithoutLabels;
  }

  public OrdersShipmentInfoDTO orderIdsWithoutLabels(Set<Long> orderIdsWithoutLabels) {
    this.orderIdsWithoutLabels = orderIdsWithoutLabels;
    return this;
  }

  public OrdersShipmentInfoDTO addOrderIdsWithoutLabelsItem(Long orderIdsWithoutLabelsItem) {
    this.orderIdsWithoutLabels.add(orderIdsWithoutLabelsItem);
    return this;
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
    return Objects.equals(this.orderIdsWithLabels, ordersShipmentInfoDTO.orderIdsWithLabels) &&
        Objects.equals(this.orderIdsWithoutLabels, ordersShipmentInfoDTO.orderIdsWithoutLabels);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


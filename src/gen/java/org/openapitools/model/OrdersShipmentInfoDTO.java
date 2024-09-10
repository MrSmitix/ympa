package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Годные/негодные ярлыки по заказам в отгрузке.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Годные/негодные ярлыки по заказам в отгрузке.")
public class OrdersShipmentInfoDTO   {
  
  private Set<Long> orderIdsWithLabels = new LinkedHashSet<>();

  private Set<Long> orderIdsWithoutLabels = new LinkedHashSet<>();

  /**
   * Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.
   **/
  public OrdersShipmentInfoDTO orderIdsWithLabels(Set<Long> orderIdsWithLabels) {
    this.orderIdsWithLabels = orderIdsWithLabels;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.")
  @JsonProperty("orderIdsWithLabels")
  @NotNull
  public Set<Long> getOrderIdsWithLabels() {
    return orderIdsWithLabels;
  }
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setOrderIdsWithLabels(Set<Long> orderIdsWithLabels) {
    this.orderIdsWithLabels = orderIdsWithLabels;
  }

  public OrdersShipmentInfoDTO addOrderIdsWithLabelsItem(Long orderIdsWithLabelsItem) {
    if (this.orderIdsWithLabels == null) {
      this.orderIdsWithLabels = new LinkedHashSet<>();
    }
    this.orderIdsWithLabels.add(orderIdsWithLabelsItem);
    return this;
  }


  /**
   * Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.
   **/
  public OrdersShipmentInfoDTO orderIdsWithoutLabels(Set<Long> orderIdsWithoutLabels) {
    this.orderIdsWithoutLabels = orderIdsWithoutLabels;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.")
  @JsonProperty("orderIdsWithoutLabels")
  @NotNull
  public Set<Long> getOrderIdsWithoutLabels() {
    return orderIdsWithoutLabels;
  }
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setOrderIdsWithoutLabels(Set<Long> orderIdsWithoutLabels) {
    this.orderIdsWithoutLabels = orderIdsWithoutLabels;
  }

  public OrdersShipmentInfoDTO addOrderIdsWithoutLabelsItem(Long orderIdsWithoutLabelsItem) {
    if (this.orderIdsWithoutLabels == null) {
      this.orderIdsWithoutLabels = new LinkedHashSet<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


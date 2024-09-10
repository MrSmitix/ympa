package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Запрос переноса заказов из отгрузки.
 **/
@ApiModel(description="Запрос переноса заказов из отгрузки.")

public class TransferOrdersFromShipmentRequest  {
  
  @ApiModelProperty(required = true, value = "Список заказов, которые вы не успеваете подготовить.")
 /**
   * Список заказов, которые вы не успеваете подготовить.
  **/
  private List<Long> orderIds = new ArrayList<>();
 /**
   * Список заказов, которые вы не успеваете подготовить.
   * @return orderIds
  **/
  @JsonProperty("orderIds")
  @NotNull
 @Size(min=1,max=500)  public List<Long> getOrderIds() {
    return orderIds;
  }

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest = (TransferOrdersFromShipmentRequest) o;
    return Objects.equals(this.orderIds, transferOrdersFromShipmentRequest.orderIds);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


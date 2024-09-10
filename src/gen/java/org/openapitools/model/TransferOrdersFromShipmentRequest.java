package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Запрос переноса заказов из отгрузки.
 **/
@ApiModel(description = "Запрос переноса заказов из отгрузки.")
@JsonTypeName("TransferOrdersFromShipmentRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class TransferOrdersFromShipmentRequest   {
  private @Valid List<Long> orderIds = new ArrayList<>();

  /**
   * Список заказов, которые вы не успеваете подготовить.
   **/
  public TransferOrdersFromShipmentRequest orderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список заказов, которые вы не успеваете подготовить.")
  @JsonProperty("orderIds")
  @NotNull  @Size(min=1,max=500)public List<Long> getOrderIds() {
    return orderIds;
  }

  @JsonProperty("orderIds")
  public void setOrderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
  }

  public TransferOrdersFromShipmentRequest addOrderIdsItem(Long orderIdsItem) {
    if (this.orderIds == null) {
      this.orderIds = new ArrayList<>();
    }

    this.orderIds.add(orderIdsItem);
    return this;
  }

  public TransferOrdersFromShipmentRequest removeOrderIdsItem(Long orderIdsItem) {
    if (orderIdsItem != null && this.orderIds != null) {
      this.orderIds.remove(orderIdsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}


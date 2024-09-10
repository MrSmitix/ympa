package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Запрос переноса заказов из отгрузки.
 */

@Schema(name = "TransferOrdersFromShipmentRequest", description = "Запрос переноса заказов из отгрузки.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class TransferOrdersFromShipmentRequest {

  @Valid
  private List<Long> orderIds = new ArrayList<>();

  public TransferOrdersFromShipmentRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TransferOrdersFromShipmentRequest(List<Long> orderIds) {
    this.orderIds = orderIds;
  }

  public TransferOrdersFromShipmentRequest orderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
    return this;
  }

  public TransferOrdersFromShipmentRequest addOrderIdsItem(Long orderIdsItem) {
    if (this.orderIds == null) {
      this.orderIds = new ArrayList<>();
    }
    this.orderIds.add(orderIdsItem);
    return this;
  }

  /**
   * Список заказов, которые вы не успеваете подготовить.
   * @return orderIds
   */
  @NotNull @Size(min = 1, max = 500) 
  @Schema(name = "orderIds", description = "Список заказов, которые вы не успеваете подготовить.", requiredMode = Schema.RequiredMode.REQUIRED)
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


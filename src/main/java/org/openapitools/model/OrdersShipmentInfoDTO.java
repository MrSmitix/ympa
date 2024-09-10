package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Годные/негодные ярлыки по заказам в отгрузке.
 */

@Schema(name = "OrdersShipmentInfoDTO", description = "Годные/негодные ярлыки по заказам в отгрузке.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrdersShipmentInfoDTO {

  @Valid
  private Set<Long> orderIdsWithLabels = new LinkedHashSet<>();

  @Valid
  private Set<Long> orderIdsWithoutLabels = new LinkedHashSet<>();

  public OrdersShipmentInfoDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OrdersShipmentInfoDTO(Set<Long> orderIdsWithLabels, Set<Long> orderIdsWithoutLabels) {
    this.orderIdsWithLabels = orderIdsWithLabels;
    this.orderIdsWithoutLabels = orderIdsWithoutLabels;
  }

  public OrdersShipmentInfoDTO orderIdsWithLabels(Set<Long> orderIdsWithLabels) {
    this.orderIdsWithLabels = orderIdsWithLabels;
    return this;
  }

  public OrdersShipmentInfoDTO addOrderIdsWithLabelsItem(Long orderIdsWithLabelsItem) {
    if (this.orderIdsWithLabels == null) {
      this.orderIdsWithLabels = new LinkedHashSet<>();
    }
    this.orderIdsWithLabels.add(orderIdsWithLabelsItem);
    return this;
  }

  /**
   * Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.
   * @return orderIdsWithLabels
   */
  @NotNull 
  @Schema(name = "orderIdsWithLabels", description = "Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("orderIdsWithLabels")
  public Set<Long> getOrderIdsWithLabels() {
    return orderIdsWithLabels;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setOrderIdsWithLabels(Set<Long> orderIdsWithLabels) {
    this.orderIdsWithLabels = orderIdsWithLabels;
  }

  public OrdersShipmentInfoDTO orderIdsWithoutLabels(Set<Long> orderIdsWithoutLabels) {
    this.orderIdsWithoutLabels = orderIdsWithoutLabels;
    return this;
  }

  public OrdersShipmentInfoDTO addOrderIdsWithoutLabelsItem(Long orderIdsWithoutLabelsItem) {
    if (this.orderIdsWithoutLabels == null) {
      this.orderIdsWithoutLabels = new LinkedHashSet<>();
    }
    this.orderIdsWithoutLabels.add(orderIdsWithoutLabelsItem);
    return this;
  }

  /**
   * Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.
   * @return orderIdsWithoutLabels
   */
  @NotNull 
  @Schema(name = "orderIdsWithoutLabels", description = "Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("orderIdsWithoutLabels")
  public Set<Long> getOrderIdsWithoutLabels() {
    return orderIdsWithoutLabels;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
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


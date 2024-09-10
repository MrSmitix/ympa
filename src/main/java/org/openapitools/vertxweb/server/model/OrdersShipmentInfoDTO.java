package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Годные/негодные ярлыки по заказам в отгрузке.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrdersShipmentInfoDTO   {
  
  private Set<Long> orderIdsWithLabels = new LinkedHashSet<>();
  private Set<Long> orderIdsWithoutLabels = new LinkedHashSet<>();

  public OrdersShipmentInfoDTO () {

  }

  public OrdersShipmentInfoDTO (Set<Long> orderIdsWithLabels, Set<Long> orderIdsWithoutLabels) {
    this.orderIdsWithLabels = orderIdsWithLabels;
    this.orderIdsWithoutLabels = orderIdsWithoutLabels;
  }

    
  @JsonProperty("orderIdsWithLabels")
  public Set<Long> getOrderIdsWithLabels() {
    return orderIdsWithLabels;
  }
  public void setOrderIdsWithLabels(Set<Long> orderIdsWithLabels) {
    this.orderIdsWithLabels = orderIdsWithLabels;
  }

    
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

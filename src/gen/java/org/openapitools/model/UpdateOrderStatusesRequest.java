package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderStateDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Список заказов.
 **/
@ApiModel(description="Список заказов.")

public class UpdateOrderStatusesRequest  {
  
  @ApiModelProperty(required = true, value = "Список заказов.")
 /**
   * Список заказов.
  **/
  private List<OrderStateDTO> orders = new ArrayList<>();
 /**
   * Список заказов.
   * @return orders
  **/
  @JsonProperty("orders")
  public List<OrderStateDTO> getOrders() {
    return orders;
  }

  public void setOrders(List<OrderStateDTO> orders) {
    this.orders = orders;
  }

  public UpdateOrderStatusesRequest orders(List<OrderStateDTO> orders) {
    this.orders = orders;
    return this;
  }

  public UpdateOrderStatusesRequest addOrdersItem(OrderStateDTO ordersItem) {
    this.orders.add(ordersItem);
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
    UpdateOrderStatusesRequest updateOrderStatusesRequest = (UpdateOrderStatusesRequest) o;
    return Objects.equals(this.orders, updateOrderStatusesRequest.orders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOrderStatusesRequest {\n");
    
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
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


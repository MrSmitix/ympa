package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderStateDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Список заказов.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Список заказов.")
public class UpdateOrderStatusesRequest   {
  
  private List<@Valid OrderStateDTO> orders = new ArrayList<>();

  /**
   * Список заказов.
   **/
  public UpdateOrderStatusesRequest orders(List<@Valid OrderStateDTO> orders) {
    this.orders = orders;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список заказов.")
  @JsonProperty("orders")
  @NotNull
 @Size(min=1,max=30)  public List<@Valid OrderStateDTO> getOrders() {
    return orders;
  }
  public void setOrders(List<@Valid OrderStateDTO> orders) {
    this.orders = orders;
  }

  public UpdateOrderStatusesRequest addOrdersItem(OrderStateDTO ordersItem) {
    if (this.orders == null) {
      this.orders = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


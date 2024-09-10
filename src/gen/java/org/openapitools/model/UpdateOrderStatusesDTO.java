package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdateOrderStatusDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Список заказов, статус которых обновился.
 */
@ApiModel(description="Список заказов, статус которых обновился.")

public class UpdateOrderStatusesDTO  {
  
 /**
  * Список с обновленными заказами.
  */
  @ApiModelProperty(required = true, value = "Список с обновленными заказами.")
  @Valid
  private List<@Valid UpdateOrderStatusDTO> orders = new ArrayList<>();
 /**
  * Список с обновленными заказами.
  * @return orders
  */
  @JsonProperty("orders")
  @NotNull
  public List<@Valid UpdateOrderStatusDTO> getOrders() {
    return orders;
  }

  /**
   * Sets the <code>orders</code> property.
   */
 public void setOrders(List<@Valid UpdateOrderStatusDTO> orders) {
    this.orders = orders;
  }

  /**
   * Sets the <code>orders</code> property.
   */
  public UpdateOrderStatusesDTO orders(List<@Valid UpdateOrderStatusDTO> orders) {
    this.orders = orders;
    return this;
  }

  /**
   * Adds a new item to the <code>orders</code> list.
   */
  public UpdateOrderStatusesDTO addOrdersItem(UpdateOrderStatusDTO ordersItem) {
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
    UpdateOrderStatusesDTO updateOrderStatusesDTO = (UpdateOrderStatusesDTO) o;
    return Objects.equals(this.orders, updateOrderStatusesDTO.orders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOrderStatusesDTO {\n");
    
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


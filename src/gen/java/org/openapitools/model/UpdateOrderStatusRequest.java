package org.openapitools.model;

import org.openapitools.model.OrderStatusChangeDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateOrderStatusRequest  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private OrderStatusChangeDTO order;
 /**
  * Get order
  * @return order
  */
  @JsonProperty("order")
  @NotNull
  public OrderStatusChangeDTO getOrder() {
    return order;
  }

  /**
   * Sets the <code>order</code> property.
   */
 public void setOrder(OrderStatusChangeDTO order) {
    this.order = order;
  }

  /**
   * Sets the <code>order</code> property.
   */
  public UpdateOrderStatusRequest order(OrderStatusChangeDTO order) {
    this.order = order;
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
    UpdateOrderStatusRequest updateOrderStatusRequest = (UpdateOrderStatusRequest) o;
    return Objects.equals(this.order, updateOrderStatusRequest.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOrderStatusRequest {\n");
    
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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


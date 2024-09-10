package org.openapitools.model;

import org.openapitools.model.OrderDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetOrderResponse  {
  
  @ApiModelProperty(value = "")
  private OrderDTO order;
 /**
   * Get order
   * @return order
  **/
  @JsonProperty("order")
  public OrderDTO getOrder() {
    return order;
  }

  public void setOrder(OrderDTO order) {
    this.order = order;
  }

  public GetOrderResponse order(OrderDTO order) {
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
    GetOrderResponse getOrderResponse = (GetOrderResponse) o;
    return Objects.equals(this.order, getOrderResponse.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOrderResponse {\n");
    
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


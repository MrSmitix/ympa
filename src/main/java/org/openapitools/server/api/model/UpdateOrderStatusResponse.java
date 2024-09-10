package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.OrderDTO;

/**
 * Информация об изменении статуса заказа.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateOrderStatusResponse   {
  
  private OrderDTO order;

  public UpdateOrderStatusResponse () {

  }

  public UpdateOrderStatusResponse (OrderDTO order) {
    this.order = order;
  }

    
  @JsonProperty("order")
  public OrderDTO getOrder() {
    return order;
  }
  public void setOrder(OrderDTO order) {
    this.order = order;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOrderStatusResponse updateOrderStatusResponse = (UpdateOrderStatusResponse) o;
    return Objects.equals(order, updateOrderStatusResponse.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOrderStatusResponse {\n");
    
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.OrderItemModificationDTO;
import org.openapitools.server.api.model.OrderItemsModificationRequestReasonType;

/**
 * Запрос на обновление состава заказа.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateOrderItemRequest   {
  
  private List<OrderItemModificationDTO> items = new ArrayList<>();
  private OrderItemsModificationRequestReasonType reason;

  public UpdateOrderItemRequest () {

  }

  public UpdateOrderItemRequest (List<OrderItemModificationDTO> items, OrderItemsModificationRequestReasonType reason) {
    this.items = items;
    this.reason = reason;
  }

    
  @JsonProperty("items")
  public List<OrderItemModificationDTO> getItems() {
    return items;
  }
  public void setItems(List<OrderItemModificationDTO> items) {
    this.items = items;
  }

    
  @JsonProperty("reason")
  public OrderItemsModificationRequestReasonType getReason() {
    return reason;
  }
  public void setReason(OrderItemsModificationRequestReasonType reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOrderItemRequest updateOrderItemRequest = (UpdateOrderItemRequest) o;
    return Objects.equals(items, updateOrderItemRequest.items) &&
        Objects.equals(reason, updateOrderItemRequest.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOrderItemRequest {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

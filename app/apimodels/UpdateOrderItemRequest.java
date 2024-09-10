package apimodels;

import apimodels.OrderItemModificationDTO;
import apimodels.OrderItemsModificationRequestReasonType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Запрос на обновление состава заказа.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UpdateOrderItemRequest   {
  @JsonProperty("items")
  @NotNull
@Size(min=1)
@Valid

  private List<@Valid OrderItemModificationDTO> items = new ArrayList<>();

  @JsonProperty("reason")
  @Valid

  private OrderItemsModificationRequestReasonType reason;

  public UpdateOrderItemRequest items(List<@Valid OrderItemModificationDTO> items) {
    this.items = items;
    return this;
  }

  public UpdateOrderItemRequest addItemsItem(OrderItemModificationDTO itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. 
   * @return items
  **/
  public List<@Valid OrderItemModificationDTO> getItems() {
    return items;
  }

  public void setItems(List<@Valid OrderItemModificationDTO> items) {
    this.items = items;
  }

  public UpdateOrderItemRequest reason(OrderItemsModificationRequestReasonType reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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


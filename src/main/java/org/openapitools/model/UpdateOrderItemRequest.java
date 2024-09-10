package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderItemModificationDTO;
import org.openapitools.model.OrderItemsModificationRequestReasonType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Запрос на обновление состава заказа.
 */

@Schema(name = "UpdateOrderItemRequest", description = "Запрос на обновление состава заказа.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOrderItemRequest {

  @Valid
  private List<@Valid OrderItemModificationDTO> items = new ArrayList<>();

  private OrderItemsModificationRequestReasonType reason;

  public UpdateOrderItemRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateOrderItemRequest(List<@Valid OrderItemModificationDTO> items) {
    this.items = items;
  }

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
   */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "items", description = "Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
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
   */
  @Valid 
  @Schema(name = "reason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    return Objects.equals(this.items, updateOrderItemRequest.items) &&
        Objects.equals(this.reason, updateOrderItemRequest.reason);
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


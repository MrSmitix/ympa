package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderItemModificationDTO;
import org.openapitools.model.OrderItemsModificationRequestReasonType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Запрос на обновление состава заказа.
 **/
@ApiModel(description="Запрос на обновление состава заказа.")

public class UpdateOrderItemRequest  {
  
  @ApiModelProperty(required = true, value = "Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. ")
  @Valid
 /**
   * Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. 
  **/
  private List<@Valid OrderItemModificationDTO> items = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private OrderItemsModificationRequestReasonType reason;
 /**
   * Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. 
   * @return items
  **/
  @JsonProperty("items")
  @NotNull
 @Size(min=1)  public List<@Valid OrderItemModificationDTO> getItems() {
    return items;
  }

  public void setItems(List<@Valid OrderItemModificationDTO> items) {
    this.items = items;
  }

  public UpdateOrderItemRequest items(List<@Valid OrderItemModificationDTO> items) {
    this.items = items;
    return this;
  }

  public UpdateOrderItemRequest addItemsItem(OrderItemModificationDTO itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
   * Get reason
   * @return reason
  **/
  @JsonProperty("reason")
  public OrderItemsModificationRequestReasonType getReason() {
    return reason;
  }

  public void setReason(OrderItemsModificationRequestReasonType reason) {
    this.reason = reason;
  }

  public UpdateOrderItemRequest reason(OrderItemsModificationRequestReasonType reason) {
    this.reason = reason;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


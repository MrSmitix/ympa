package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.OrderItemModificationDTO;
import com.prokarma.pkmst.model.OrderItemsModificationRequestReasonType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Запрос на обновление состава заказа.
 */
@ApiModel(description = "Запрос на обновление состава заказа.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOrderItemRequest   {
  @JsonProperty("items")
  
  private List<OrderItemModificationDTO> items = new ArrayList<>();

  @JsonProperty("reason")
  private OrderItemsModificationRequestReasonType reason;

  public UpdateOrderItemRequest items(List<OrderItemModificationDTO> items) {
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
  @ApiModelProperty(required = true, value = "Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. ")
  public List<OrderItemModificationDTO> getItems() {
    return items;
  }

  public void setItems(List<OrderItemModificationDTO> items) {
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
  @ApiModelProperty(value = "")
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


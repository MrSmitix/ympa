package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderItemInstanceModificationDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ProvideOrderItemIdentifiersRequest  {
  
  @ApiModelProperty(required = true, value = "Список позиций, требующих маркировки. ")
 /**
   * Список позиций, требующих маркировки. 
  **/
  private List<OrderItemInstanceModificationDTO> items = new ArrayList<>();
 /**
   * Список позиций, требующих маркировки. 
   * @return items
  **/
  @JsonProperty("items")
  public List<OrderItemInstanceModificationDTO> getItems() {
    return items;
  }

  public void setItems(List<OrderItemInstanceModificationDTO> items) {
    this.items = items;
  }

  public ProvideOrderItemIdentifiersRequest items(List<OrderItemInstanceModificationDTO> items) {
    this.items = items;
    return this;
  }

  public ProvideOrderItemIdentifiersRequest addItemsItem(OrderItemInstanceModificationDTO itemsItem) {
    this.items.add(itemsItem);
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
    ProvideOrderItemIdentifiersRequest provideOrderItemIdentifiersRequest = (ProvideOrderItemIdentifiersRequest) o;
    return Objects.equals(this.items, provideOrderItemIdentifiersRequest.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvideOrderItemIdentifiersRequest {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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


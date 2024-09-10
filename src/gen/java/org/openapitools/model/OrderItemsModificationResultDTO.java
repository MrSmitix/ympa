package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BriefOrderItemDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Краткие сведения о промаркированных товарах. Параметр возвращается, если ответ `OK`. 
 **/
@ApiModel(description="Краткие сведения о промаркированных товарах. Параметр возвращается, если ответ `OK`. ")

public class OrderItemsModificationResultDTO  {
  
  @ApiModelProperty(required = true, value = "Список позиций в заказе, подлежащих маркировке.")
 /**
   * Список позиций в заказе, подлежащих маркировке.
  **/
  private List<BriefOrderItemDTO> items = new ArrayList<>();
 /**
   * Список позиций в заказе, подлежащих маркировке.
   * @return items
  **/
  @JsonProperty("items")
  public List<BriefOrderItemDTO> getItems() {
    return items;
  }

  public void setItems(List<BriefOrderItemDTO> items) {
    this.items = items;
  }

  public OrderItemsModificationResultDTO items(List<BriefOrderItemDTO> items) {
    this.items = items;
    return this;
  }

  public OrderItemsModificationResultDTO addItemsItem(BriefOrderItemDTO itemsItem) {
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
    OrderItemsModificationResultDTO orderItemsModificationResultDTO = (OrderItemsModificationResultDTO) o;
    return Objects.equals(this.items, orderItemsModificationResultDTO.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemsModificationResultDTO {\n");
    
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


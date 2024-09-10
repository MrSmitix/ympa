package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderBoxLayoutItemDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о коробке.
 **/
@ApiModel(description="Информация о коробке.")

public class OrderBoxLayoutDTO  {
  
  @ApiModelProperty(required = true, value = "Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. ")
 /**
   * Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
  **/
  private List<OrderBoxLayoutItemDTO> items = new ArrayList<>();
 /**
   * Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
   * @return items
  **/
  @JsonProperty("items")
  public List<OrderBoxLayoutItemDTO> getItems() {
    return items;
  }

  public void setItems(List<OrderBoxLayoutItemDTO> items) {
    this.items = items;
  }

  public OrderBoxLayoutDTO items(List<OrderBoxLayoutItemDTO> items) {
    this.items = items;
    return this;
  }

  public OrderBoxLayoutDTO addItemsItem(OrderBoxLayoutItemDTO itemsItem) {
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
    OrderBoxLayoutDTO orderBoxLayoutDTO = (OrderBoxLayoutDTO) o;
    return Objects.equals(this.items, orderBoxLayoutDTO.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderBoxLayoutDTO {\n");
    
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


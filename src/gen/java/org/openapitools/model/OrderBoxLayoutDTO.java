package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderBoxLayoutItemDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация о коробке.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Информация о коробке.")
public class OrderBoxLayoutDTO   {
  
  private List<@Valid OrderBoxLayoutItemDTO> items = new ArrayList<>();

  /**
   * Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
   **/
  public OrderBoxLayoutDTO items(List<@Valid OrderBoxLayoutItemDTO> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. ")
  @JsonProperty("items")
  @NotNull
 @Size(min=1)  public List<@Valid OrderBoxLayoutItemDTO> getItems() {
    return items;
  }
  public void setItems(List<@Valid OrderBoxLayoutItemDTO> items) {
    this.items = items;
  }

  public OrderBoxLayoutDTO addItemsItem(OrderBoxLayoutItemDTO itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


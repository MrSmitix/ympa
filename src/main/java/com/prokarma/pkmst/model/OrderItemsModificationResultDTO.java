package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.BriefOrderItemDTO;
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
 * Краткие сведения о промаркированных товарах. Параметр возвращается, если ответ &#x60;OK&#x60;. 
 */
@ApiModel(description = "Краткие сведения о промаркированных товарах. Параметр возвращается, если ответ `OK`. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderItemsModificationResultDTO   {
  @JsonProperty("items")
  
  private List<BriefOrderItemDTO> items = new ArrayList<>();

  public OrderItemsModificationResultDTO items(List<BriefOrderItemDTO> items) {
    this.items = items;
    return this;
  }

  public OrderItemsModificationResultDTO addItemsItem(BriefOrderItemDTO itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Список позиций в заказе, подлежащих маркировке.
   * @return items
   */
  @ApiModelProperty(required = true, value = "Список позиций в заказе, подлежащих маркировке.")
  public List<BriefOrderItemDTO> getItems() {
    return items;
  }

  public void setItems(List<BriefOrderItemDTO> items) {
    this.items = items;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

